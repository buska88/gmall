package com.ljf.gmall.product.fallback;


import com.ljf.common.utils.R;
import com.ljf.gmall.product.feign.SeckillFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.ljf.common.exception.BizCodeEnume;


@Slf4j
@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        log.info("熔断方法调用");
        return R.error(BizCodeEnume.TOO_MANY_REQUEST.getCode(),BizCodeEnume.TOO_MANY_REQUEST.getMessage());
    }
}
