package com.ztgreat.cola.command;

import com.alibaba.cola.dto.Response;
import com.ztgreat.cola.dto.MetricDeleteCmd;
import com.ztgreat.cola.gatewayimpl.database.MetricMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * MetricDeleteCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-04 3:01 PM
 */
@Component
public class MetricDeleteCmdExe{

    @Resource
    private MetricMapper metricMapper;

    public Response execute(MetricDeleteCmd cmd) {

        metricMapper.delete(cmd.getMetricId(), cmd.getOperater());

        return Response.buildSuccess();
    }
}