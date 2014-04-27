package controllers;

import play.libs.F;
import play.libs.F.Promise;
import play.mvc.*;
import play.mvc.Http.Context;
import utils.ConsoleLog;
import utils.ExceptionMailer;

public class LogAction extends Action<Log>
{

	public F.Promise<SimpleResult> call(Http.Context ctx)
	{
			try
			{
				return delegate.call(ctx);
			}
			catch (Throwable e)
			{
				if(configuration.log())
				{
					ConsoleLog.log(e);
				}
				throw new RuntimeException(e);
			}	
	}
}
