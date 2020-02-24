package co.grandcircus.mileageLab;

import javax.swing.text.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mileageController {
	private String vult = "<img id=\"vul\" src=\"images/vulture.jpeg\" alt =\"That's your future\">";
	private String alt = "<img id=\"car\" src=\"images/car.jpeg\" alt =\"Living the dream\">\"";
	private String alt2 = "<img id=\"oldcar\" src=\"images/oldcar.jpeg\" alt =\"Living the dream\">\"";

	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}

	@RequestMapping("/mileage-form")
	public ModelAndView MileForm() {
		ModelAndView mav = new ModelAndView("MileageForm");
		return mav;
	}

	@RequestMapping("/mileage-result")
	public ModelAndView MileResult(@RequestParam("mpg") Double mpg, @RequestParam("gallons") Double gal,
			@RequestParam("dist") Double dist) {
		ModelAndView mav = new ModelAndView("MileageResult");
		TripCalc calc = new TripCalc(mpg, gal, dist);
		Double range = calc.getRange();
		String ans = calc.makeIt();

		switch (calc.getValid()) {
		case 1: {
			mav.addObject("dance", vult);
			break;
		}
		case 2: {
			mav.addObject("dance", alt2);
			break;
		}
		case 3: {
			mav.addObject("dance", alt);
			break;
		}
		default: {
			mav.addObject("dance", alt2);
			break;
		}
		}

		mav.addObject("gallons", gal);
		mav.addObject("mpg", mpg);
		mav.addObject("dist", dist);
		mav.addObject("ans", ans);
		mav.addObject("range", range);
		return mav;
	}

	@RequestMapping("/Tip-Cal")
	public ModelAndView TipForm() {
		ModelAndView mav = new ModelAndView("TipCal");
		return mav;
	}

	@RequestMapping("/Tip-Result")
	public ModelAndView TipResult(@RequestParam("bill") Double bill, @RequestParam("tip") Double t,
			@RequestParam("cust") Double c) {

		if (t == 0) {
			ModelAndView mav = new ModelAndView("NoTip");
			mav.addObject("bill", bill);
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("TipResult");
			TipCalc tipper = new TipCalc(bill);
			Double tip;
			if (t == -1) {
				tip = tipper.tipper(c / 100);
			} else {
				tip = tipper.tipper(t);
			}
			String.format("%f.2", tip);
			mav.addObject("tip", tip);
			mav.addObject("bill", bill);

			return mav;
		}

	}

	@RequestMapping("/alias-gen")
	public ModelAndView AliasForm() {
		ModelAndView mav = new ModelAndView("AliasGen");
		return mav;
	}

	@RequestMapping("/alias-result")
	public ModelAndView AliasResult(@RequestParam("fname") String fname, @RequestParam("lname") String lname) {
		ModelAndView mav = new ModelAndView("AliasResult");
		AliasGenerator AG = new AliasGenerator(fname, lname);
		String first = AG.firstAlias();
		String last = AG.lastAlias();
		mav.addObject("falias", first);
		mav.addObject("lalias", last);

		return mav;
	}

}
