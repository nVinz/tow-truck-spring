package my.nvinz.towtruck.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public Data getData(String id) {
        return dataRepository.findById(id).orElse(null);
    }

    public void setData(Data data) {
        dataRepository.save(data);
    }
}
