package teammates.logic.core;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class EvaluationSubmissionAdjustmentWorkerServlet extends HttpServlet  {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		doGet(req, resp);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		EvaluationSubmissionAdjustmentAction adjustmentAction = new EvaluationSubmissionAdjustmentAction(req);
		boolean isExecuteSuccessful = adjustmentAction.execute();
		if (!isExecuteSuccessful) {
			//Retry task if failed
			resp.setStatus(100);
		}
	}
}
