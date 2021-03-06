package com.ljf.gmall.search.service;


import com.ljf.common.es.SkuEsModel;

import java.io.IOException;
import java.util.List;


public interface ProductSaveService {

    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
