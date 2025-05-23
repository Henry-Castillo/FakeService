package com.logcs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

@Controller
public class WebController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

/*	@Value("${project2.jar.path:C:/opt/logistica/LogisticaSpring.jar}")
	private String jarPath;




	@PostMapping("/run")
	public String runProject2(Model model) {
		try {
			ProcessBuilder pb = new ProcessBuilder("java", "-jar", jarPath);

			pb.redirectErrorStream(true);
			Process proc = pb.start();

			StringBuilder output = new StringBuilder();
			try (BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()))) {
				String line;
				while ((line = in.readLine()) != null) {
					output.append(line).append("<br/>");
				}
			}

			int exitCode = proc.waitFor();
			model.addAttribute("message", "Proyecto 2 terminó con código " + exitCode + "<br/>Salida:<br/>" + output);

		} catch (Exception e) {
			model.addAttribute("message", "Error al lanzar Proyecto 2: " + e.getMessage());
		}
		return "index";
	}*/
}
