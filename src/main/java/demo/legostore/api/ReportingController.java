package demo.legostore.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.legostore.model.AvgRatingModel;
import demo.legostore.persistence.ReportService;

@RestController
@RequestMapping("legostore/api/reports")
public class ReportingController {
    private ReportService reportService;

    public ReportingController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("avgRatingsReport")
    public List<AvgRatingModel> avgRatingReport(){
        return this.reportService.getAvgRatingReport();
    }
}
