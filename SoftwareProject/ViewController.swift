//
//  ViewController.swift
//  SoftwareProject
//
//  Created by Caoimhe Malone on 30/11/2017.
//  Copyright © 2017 Caoimhe Malone. All rights reserved.
//

import UIKit
import QuartzCore

class ViewController: UIViewController {
    //MARK: Properties
    
    @IBOutlet weak var onLBL: UILabel?

    @IBOutlet weak var loginBTN: UIButton!
    @IBOutlet weak var registerBTN: UIButton!
    override func viewDidLoad() {
        super.viewDidLoad()
        onLBL?.layer.cornerRadius = 5
    }


    //MARK: Actions
    @IBAction func loginBTN(_ sender: UIButton) {
        performSegue(withIdentifier: "toLoginPage", sender: self)
    }
    @IBAction func registerBTN(_ sender: UIButton) {
        performSegue(withIdentifier: "toRegisterPage", sender: self)
    }
    
    
}

