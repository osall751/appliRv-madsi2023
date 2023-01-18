package sn.sat.ugb.appliRvmadsi.controleur;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.sat.ugb.appliRvmadsi.modeles.RendezVous;
import sn.sat.ugb.appliRvmadsi.services.ServiceRendezVous;

import java.util.List;

@RestController
@RequestMapping("rvs")
public class RendezVousControleur {
    private final ServiceRendezVous serviceRendezVous;

    public RendezVousControleur(ServiceRendezVous serviceRendezVous) {
        this.serviceRendezVous = serviceRendezVous;
    }

    @GetMapping("/tousrv")
    public ResponseEntity<List<RendezVous>> getAllRvs(){
        List<RendezVous> rvs=serviceRendezVous.getAllRvs();
        return new ResponseEntity<List<RendezVous>>(rvs, HttpStatus.OK);
    }

    @DeleteMapping("/supprimer/{id}")
    public ResponseEntity<RendezVous> supprimerRvParId(@PathVariable("id") String id){
        serviceRendezVous.supprimerRV(id);
        return new ResponseEntity<RendezVous>(HttpStatus.OK);
    }

    @PostMapping("/ajouter")
    public ResponseEntity<RendezVous> ajouterUnRv(@RequestBody RendezVous rv){
        RendezVous newRv=serviceRendezVous.ajouterRV(rv);
        return new ResponseEntity<RendezVous>(newRv, HttpStatus.CREATED);
    }
}
