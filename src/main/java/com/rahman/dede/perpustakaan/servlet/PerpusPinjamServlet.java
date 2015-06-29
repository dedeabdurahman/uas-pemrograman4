package com.rahman.dede.perpustakaan.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import com.rahman.dede.perpustakaan.Perpus;
//import com.rahman.dede.perpustakaan.dao.PerpusDao;


@WebServlet("/perpus/pinjam")
public class PerpusPinjamServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) 
                                        throws IOException, ServletException {
                                        
        /*// Koneksi database
        PerpusDao td = new PerpusDao();
                                        
        // Data yang akan ditampilkan
        List<Perpus> daftarPerpus = td.semuaPerpus();
        
        // masukkan data ke request attribute
        req.setAttribute("perpus", daftarPerpus);
        
		*/
		/*List<Perpus> daftarPerpus = new ArrayList<Perpus>();
		
		Perpus p1 = new Perpus();
		p1.setKodeBuku(1);
		p1.setNamaBuku("Matematika");
		p1.setStok(120);
		daftarPerpus.add(p1);
		
		Perpus p2 = new Perpus();
		p2.setKodeBuku(2);
		p2.setNamaBuku("RPL");
		p2.setStok(120);
		daftarPerpus.add(p2);
		
		Perpus p3 = new Perpus();
		p3.setKodeBuku(3);
		p3.setNamaBuku("Jaringan Komputer");
		p3.setStok(50);
		daftarPerpus.add(p3);
		
		req.setAttribute("perpus", daftarPerpus);
		*/
        // redirect ke tampilan
        String lokasiJsp = "/WEB-INF/jsp/perpus/pinjam.jsp";
        RequestDispatcher rd = req.getRequestDispatcher(lokasiJsp);
        rd.forward(req, res);                         
    }
}