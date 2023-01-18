package sn.sat.ugb.appliRvmadsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.sat.ugb.appliRvmadsi.modeles.RendezVous;
import sn.sat.ugb.appliRvmadsi.repos.RendezVousRepo;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceRendezVous {
    private final RendezVousRepo rendezVousRepo;
    @Autowired
    public ServiceRendezVous(RendezVousRepo rendezVousRepo) {
        this.rendezVousRepo = rendezVousRepo;
    }

    public RendezVous ajouterRV(RendezVous rv){
        rv.setId(UUID.randomUUID().toString());
        return rendezVousRepo.save(rv);
    }

    public List<RendezVous> getAllRvs(){
        return rendezVousRepo.findAll();
    }

    public void supprimerRV(String id){
        rendezVousRepo.deleteById(id);
    }
}
