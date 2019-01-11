package com.murali.outofboxforstudent;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity implements OnClickListener {

	View accelfrontline,accenture,acer,adobe,adp,agc,alight,amd,apc,apple,asus,
	aurionpro,birlasoft,ca,canon,capgemini,careers,centurylink,cisco,citi,citrix,
	cmc,cognizant,compuage,core,csc,csscorp,cybage,cyient,dell,dellemc,deloitte,
	directi,dlink,eclerx,epam,epson,eurofins,fortune,fujitsu,genpact,geometricplm,
	hcl,hp,hexaware,huawei,ibm,igate,ignatiuz,infinite,infosys,ingram,intel,intellect,
	intergraph,intex,iriscomputers,itcinfotech,jpmorgan,juniper,kellyservices,kpit,
	larsenandtoubroinfotech,lendingkart,lenovo,lgindia,lycos,mastek,microsoft,mindtree,
	mphasis,neoteric,netapp,netsuite,niit,nokia,nucleussoftware,onmobile,oracle,
	persistent,polaris,prospus,qlikq,redington,ricoh,rolta,rs,rsystems,sai,sap,sasken,
	savex,seagate,sify,singtel,sonata,sqs,subex,supertron,symantec,synergy,synopsys,
	syntel,systemsoft,take,tataelxsi,tatatechnologies,tcs,teamcomputers,techmahinra,
	threeiinfotech,trigyn,tsystems,vakrangee,valuelabs,verizon,virtusa,visa,vmware,
	vsoft,wipro,xerox,zensar,zylogsystems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        accelfrontline=findViewById(R.id.accelfrontline);
        accenture=findViewById(R.id.accenture);
        acer=findViewById(R.id.acer);
        adobe=findViewById(R.id.adobe);
        adp=findViewById(R.id.adp);
        agc=findViewById(R.id.agc);
        alight=findViewById(R.id.alight);
        amd=findViewById(R.id.amd);
        apc=findViewById(R.id.apc);
        apple=findViewById(R.id.apple);
        asus=findViewById(R.id.asus);
        aurionpro=findViewById(R.id.aurionpro);
        birlasoft=findViewById(R.id.birlasoft);
        ca=findViewById(R.id.ca);
        canon=findViewById(R.id.canon);
        capgemini=findViewById(R.id.capgemini);
        careers=findViewById(R.id.careers);
        centurylink=findViewById(R.id.centurylink);
        cisco=findViewById(R.id.cisco);
        citi=findViewById(R.id.citi);
        citrix=findViewById(R.id.citrix);
        cmc=findViewById(R.id.cmc);
        cognizant=findViewById(R.id.cognizant);
        compuage=findViewById(R.id.compuage);
        core=findViewById(R.id.core);
        csc=findViewById(R.id.csc);
        csscorp=findViewById(R.id.csscorp);
        cybage=findViewById(R.id.cybage);
        cyient=findViewById(R.id.cyient);
        dell=findViewById(R.id.dell);
        dellemc=findViewById(R.id.dellemc);
        deloitte=findViewById(R.id.deloitte);
        directi=findViewById(R.id.directi);
        dlink=findViewById(R.id.dlink);
        eclerx=findViewById(R.id.eclerx);
        epam=findViewById(R.id.epam);
        epson=findViewById(R.id.epson);
        eurofins=findViewById(R.id.eurofins);
        fortune=findViewById(R.id.fortune);
        fujitsu=findViewById(R.id.fujitsu);
        genpact=findViewById(R.id.genpact);
        geometricplm=findViewById(R.id.geometricplm);
        hcl=findViewById(R.id.hcl);
        hp=findViewById(R.id.hewlettpackardenterprise);
        hexaware=findViewById(R.id.hexaware);
        huawei=findViewById(R.id.huawei);
        ibm=findViewById(R.id.ibm);
        igate=findViewById(R.id.igate);
        ignatiuz=findViewById(R.id.ignatiuz);
        infinite=findViewById(R.id.infinite);
        infosys=findViewById(R.id.infosys);
        ingram=findViewById(R.id.ingram);
        intel=findViewById(R.id.intel);
        intellect=findViewById(R.id.intellect);
        intergraph=findViewById(R.id.intergraph);
        intex=findViewById(R.id.intex);
        iriscomputers=findViewById(R.id.iriscomputers);
        itcinfotech=findViewById(R.id.itcinfotech);
        jpmorgan=findViewById(R.id.jpmorgan);
        juniper=findViewById(R.id.juniper);
        kellyservices=findViewById(R.id.kellyservices);
        kpit=findViewById(R.id.kpit);
        larsenandtoubroinfotech=findViewById(R.id.larsenandtoubroinfotech);
        lendingkart=findViewById(R.id.lendingkart);
        lenovo=findViewById(R.id.lenovo);
        lgindia=findViewById(R.id.lgindia);
        lycos=findViewById(R.id.lycos);
        mastek=findViewById(R.id.mastek);
        microsoft=findViewById(R.id.microsoft);
        mindtree=findViewById(R.id.mindtree);
        mphasis=findViewById(R.id.mphasis);
        neoteric=findViewById(R.id.neoteric);
        netapp=findViewById(R.id.netapp);
        netsuite=findViewById(R.id.netsuite);
        niit=findViewById(R.id.niit);
        nokia=findViewById(R.id.nokia);
        nucleussoftware=findViewById(R.id.nucleussoftware);
        onmobile=findViewById(R.id.onmobile);
        oracle=findViewById(R.id.oracle);
        persistent=findViewById(R.id.persistent);
        polaris=findViewById(R.id.polaris);
        prospus=findViewById(R.id.prospus);
        qlikq=findViewById(R.id.qlikq);
        redington=findViewById(R.id.redington);
        ricoh=findViewById(R.id.ricoh);
        rolta=findViewById(R.id.rolta);
        rs=findViewById(R.id.rs);
        rsystems=findViewById(R.id.rsystems);
        sai=findViewById(R.id.sai);
        sap=findViewById(R.id.sap);
        sasken=findViewById(R.id.sasken);
        savex=findViewById(R.id.savex);
        seagate=findViewById(R.id.seagate);
        sify=findViewById(R.id.sify);
        singtel=findViewById(R.id.singtel);
        sonata=findViewById(R.id.sonata);
        sqs=findViewById(R.id.sqs);
        subex=findViewById(R.id.subex);
        supertron=findViewById(R.id.supertron);
        symantec=findViewById(R.id.symantec);
        synergy=findViewById(R.id.synergy);
        synopsys=findViewById(R.id.synopsys);
        syntel=findViewById(R.id.syntel);
        systemsoft=findViewById(R.id.systemsoft);
        take=findViewById(R.id.take);
        tataelxsi=findViewById(R.id.tataelxsi);
        tatatechnologies=findViewById(R.id.tatatechnologies);
        tcs=findViewById(R.id.tcs);
        teamcomputers=findViewById(R.id.teamcomputers);
        techmahinra=findViewById(R.id.techmahinra);
        threeiinfotech=findViewById(R.id.threeiinfotech);
        trigyn=findViewById(R.id.trigyn);
        tsystems=findViewById(R.id.tsystems);
        vakrangee=findViewById(R.id.vakrangee);
        valuelabs=findViewById(R.id.valuelabs);
        verizon=findViewById(R.id.verizon);
        virtusa=findViewById(R.id.virtusa);
        visa=findViewById(R.id.visa);
        vmware=findViewById(R.id.vmware);
        vsoft=findViewById(R.id.vsoftconsultinggroup);
        wipro=findViewById(R.id.wipro);
        xerox=findViewById(R.id.xerox);
        zensar=findViewById(R.id.zensar);
        zylogsystems=findViewById(R.id.zylogsystems);    
        
        
        accelfrontline.setOnClickListener(this);
        accenture.setOnClickListener(this);
        acer.setOnClickListener(this);
        adobe.setOnClickListener(this);
        adp.setOnClickListener(this);
        agc.setOnClickListener(this);
        alight.setOnClickListener(this);
        amd.setOnClickListener(this);
        apc.setOnClickListener(this);
        apple.setOnClickListener(this);
        asus.setOnClickListener(this);
        aurionpro.setOnClickListener(this);
        birlasoft.setOnClickListener(this);
        ca.setOnClickListener(this);
        canon.setOnClickListener(this);
        capgemini.setOnClickListener(this);
        careers.setOnClickListener(this);
        centurylink.setOnClickListener(this);
        cisco.setOnClickListener(this);
        citi.setOnClickListener(this);
        citrix.setOnClickListener(this);
        cmc.setOnClickListener(this);
        cognizant.setOnClickListener(this);
        compuage.setOnClickListener(this);
        core.setOnClickListener(this);
        csc.setOnClickListener(this);
        csscorp.setOnClickListener(this);
        cybage.setOnClickListener(this);
        cyient.setOnClickListener(this);
        dell.setOnClickListener(this);
        dellemc.setOnClickListener(this);
        deloitte.setOnClickListener(this);
        directi.setOnClickListener(this);
        dlink.setOnClickListener(this);
        eclerx.setOnClickListener(this);
        epam.setOnClickListener(this);
        epson.setOnClickListener(this);
        eurofins.setOnClickListener(this);
        fortune.setOnClickListener(this);
        fujitsu.setOnClickListener(this);
        genpact.setOnClickListener(this);
        geometricplm.setOnClickListener(this);
        hcl.setOnClickListener(this);
        hp.setOnClickListener(this);
        hexaware.setOnClickListener(this);
        huawei.setOnClickListener(this);
        ibm.setOnClickListener(this);
        igate.setOnClickListener(this);
        ignatiuz.setOnClickListener(this);
        infinite.setOnClickListener(this);
        infosys.setOnClickListener(this);
        ingram.setOnClickListener(this);
        intel.setOnClickListener(this);
        intellect.setOnClickListener(this);
        intergraph.setOnClickListener(this);
        intex.setOnClickListener(this);
        iriscomputers.setOnClickListener(this);
        itcinfotech.setOnClickListener(this);
        jpmorgan.setOnClickListener(this);
        juniper.setOnClickListener(this);
        kellyservices.setOnClickListener(this);
        kpit.setOnClickListener(this);
        larsenandtoubroinfotech.setOnClickListener(this);
        lendingkart.setOnClickListener(this);
        lenovo.setOnClickListener(this);
        lgindia.setOnClickListener(this);
        lycos.setOnClickListener(this);
        mastek.setOnClickListener(this);
        microsoft.setOnClickListener(this);
        mindtree.setOnClickListener(this);
        mphasis.setOnClickListener(this);
        neoteric.setOnClickListener(this);
        netapp.setOnClickListener(this);
        netsuite.setOnClickListener(this);
        niit.setOnClickListener(this);
        nokia.setOnClickListener(this);
        nucleussoftware.setOnClickListener(this);
        onmobile.setOnClickListener(this);
        oracle.setOnClickListener(this);
        persistent.setOnClickListener(this);
        polaris.setOnClickListener(this);
        prospus.setOnClickListener(this);
        qlikq.setOnClickListener(this);
        redington.setOnClickListener(this);
        ricoh.setOnClickListener(this);
        rolta.setOnClickListener(this);
        rs.setOnClickListener(this);;
        rsystems.setOnClickListener(this);
        sai.setOnClickListener(this);
        sap.setOnClickListener(this);
        sasken.setOnClickListener(this);
        savex.setOnClickListener(this);
        seagate.setOnClickListener(this);
        sify.setOnClickListener(this);
        singtel.setOnClickListener(this);
        sonata.setOnClickListener(this);
        sqs.setOnClickListener(this);
        subex.setOnClickListener(this);
        supertron.setOnClickListener(this);
        symantec.setOnClickListener(this);
        synergy.setOnClickListener(this);
        synopsys.setOnClickListener(this);
        syntel.setOnClickListener(this);
        systemsoft.setOnClickListener(this);
        take.setOnClickListener(this);
        tataelxsi.setOnClickListener(this);
        tatatechnologies.setOnClickListener(this);
        tcs.setOnClickListener(this);
        teamcomputers.setOnClickListener(this);
        techmahinra.setOnClickListener(this);
        threeiinfotech.setOnClickListener(this);
        trigyn.setOnClickListener(this);
        tsystems.setOnClickListener(this);
        vakrangee.setOnClickListener(this);
        valuelabs.setOnClickListener(this);
        verizon.setOnClickListener(this);
        virtusa.setOnClickListener(this);
        visa.setOnClickListener(this);
        vmware.setOnClickListener(this);
        vsoft.setOnClickListener(this);
        wipro.setOnClickListener(this);
        xerox.setOnClickListener(this);
        zensar.setOnClickListener(this);
        zylogsystems.setOnClickListener(this);  
        
        
    }
    
    @Override
    public void onClick(View v){
    	
    	Intent websiteIntent;
    	switch(v.getId()){
    	
    	case R.id.accelfrontline:
    	websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://accelfrontline.com/#career")); 
       	   startActivity(websiteIntent);
       	   break;
    		
    	case R.id.accenture:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.accenture.com/in-en/Careers/")); 
        	   startActivity(websiteIntent);
        	   break;
    		
    	case R.id.acer:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.acer.com/ac/en/IN/content/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.adobe:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.adobe.com/careers/engineering.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.adp:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://jobs.adp.com/locations/india/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.agc:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.agcnetworks.com/in/career/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.alight:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://alight.com/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.amd:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amd.com/en-us/who-we-are/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.apc:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apc.com/in/en/who-we-are/careers.jsp")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.apple:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/jobs/in/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.asus:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.asus.com/in/ASUS_Website_Information/Careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.aurionpro:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aurionpro.com/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.birlasoft:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://birlasoft.taleo.net/careersection/ex/moresearch.ftl")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.ca:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://searchjobs.ca.com/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.canon:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.canon.co.in/personal/web/company/about/careers?languageCode=EN")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.capgemini:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://jobs.capgemini.com/#")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.careers:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://target.taleo.net/careersection/tgt_india/jobsearch.ftl?lang=en")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.centurylink:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.centurylinkindia.com/Careers/Why_join_Us.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.cisco:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cisco.com/c/en/us/about/careers/working-at-cisco/students-and-new-graduate-programs.html#~stickynav=1")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.citi:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.online.citibank.co.in/careers/careers-at-citi.htm")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.citrix:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://jobs.citrix.com/c/information-technology-jobs")); 
        	   startActivity(websiteIntent);
        	   break;
    	case R.id.cmc:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cmcltd.com/")); 
        	   startActivity(websiteIntent);
        	   break;
    	case R.id.cognizant:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cognizant.com/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.compuage:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.compuageindia.com/careers.php")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.core:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.core-edutech.com/careers-india.php")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.csc:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://jobs.dxc.technology/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.csscorp:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.csscorp.com/company/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.cybage:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cybage.com/careers/current-openings")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.cyient:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cyient.com/careers/current-openings/#")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.dell:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://jobs.dell.com/search-jobs")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.dellemc:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dell.com/learn/in/en/incorp1/careers?c=in&l=en&s=corp")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.deloitte:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www2.deloitte.com/in/en/careers/life-at-deloitte.html?icid=bottom_life-at-deloitte")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.directi:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://careers.directi.com/display/CAR/Current+Openings")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.dlink:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://dlink.co.in/corporate/employ/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.eclerx:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.eclerx.com/Pages/Corp_HR_Careers_Job-Openings.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.epam:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.epam.com/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.epson:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://epson.com/about-us-careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.eurofins:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eurofins.in/careers/")); 
        	   startActivity(websiteIntent);
        	   break;
    	case R.id.fortune:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fortune-it.com/career.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.fujitsu:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fujitsu.com/in/about/info-center/job-seekers/application/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.genpact:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.genpact.com/")); 
        	   startActivity(websiteIntent);
        	   break;
    	case R.id.geometricplm:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://careers.geometricglobal.com/careers/current-opportunities/?country=india")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.hcl:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hcl.com/apply-now")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.hewlettpackardenterprise:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hpe.com/in/en/about/jobs.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.hexaware:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://hexaware.com/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.huawei:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.huawei.com/ca/about-huawei/careers/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.ibm:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www-07.ibm.com/in/careers/index.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.igate:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.igate.com/Careers/Joblist.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.ignatiuz:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://ignatiuz.com/about-us/careers/india/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.infinite:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.infinite.com/company/careers/#")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.infosys:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.infosys.com/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.ingram:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://jobs.jobvite.com/ingrammicro/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.intel:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.intel.com/content/www/us/en/jobs/locations/india.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.intellect:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.intellectdesign.com/careers/index.asp")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.intergraph:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.intergraph.com/")); 
        	   startActivity(websiteIntent);
        	   break;
    	case R.id.intex:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.intex.in/Careers/Index")); 
        	   startActivity(websiteIntent);
        	   break;
    	case R.id.iriscomputers:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.irissoftware.com/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.itcinfotech:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.itcinfotech.com/career")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.jpmorgan:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.jpmorgan.com/careers/home")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.juniper:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.juniper.net/careers/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.kellyservices:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kellyservices.co.in/in/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.kpit:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kpit.com/company/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.larsenandtoubroinfotech:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lntinfotech.com/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.lendingkart:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lendingkart.com/career")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.lenovo:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://lenovocareers.com/locations-asia.html#search")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.lgindia:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lg.com/in/about-lg/career")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.lycos:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://info.lycos.com/career-opportunities/life-at-lycos/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.mastek:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mastek.com/careers#")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.microsoft:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.microsoft.com/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.mindtree:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mindtree.com/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.mphasis:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.mphasis.com/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.neoteric:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://neoteric.eu/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.netapp:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.netapp.com/us/careers/index.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.netsuite:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.netsuite.com/portal/career/openings-ca.shtml")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.niit:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.niit.com/india/training/career/Pages/career-home.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.nokia:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nokia.com/en_int/about-us/careers/open-jobs")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.nucleussoftware:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nucleussoftware.com/careers/open-positions")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.onmobile:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.onmobile.com/career/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.oracle:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.oracle.com/corporate/careers/index.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.persistent:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.persistent.com/careers/jobs/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.polaris:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.polarisft.com/careers/index.asp")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.prospus:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.prospus.com/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.qlikq:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.qlik.com/us/company/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.redington:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redingtonmea.com/redington-gulf-careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.ricoh:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ricoh.co.in/about/career")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.rolta:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rolta.com/rolta-careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.rs:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rssoftware.com/careers2")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.rsystems:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rsystems.com/careers/default.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.sai:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.saitechnology.com/careers.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.sap:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sap.com/india/about/careers.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.sasken:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://careers.sasken.com/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.savex:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.savex.org/company-info.htm#")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.seagate:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seagate.com/in/en/jobs/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.sify:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://corporate.sify.com/search/careers.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.singtel:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.singtel.com/about-us/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.sonata:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://sonata.taleo.net/careersection/ex/jobsearch.ftl?lang=en")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.sqs:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sqs.com/en/careers/early-careers.php")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.subex:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://careers.subex.com/jobs/")); 
        	   startActivity(websiteIntent);
        	   break;
    	case R.id.supertron:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.supertroninfotech.in/careers.php")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.symantec:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://symantec.wd1.myworkdayjobs.com/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.synergy:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.synergycom.com/SubmitResume.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.synopsys:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.synopsys.com/company/synopsys-careers.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.syntel:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.syntelinc.com/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.systemsoft:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sstech.us/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.take:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.takesolutions.com/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.tataelxsi:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tataelxsi.com/company/careers.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.tatatechnologies:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tatatechnologies.com/in/careers/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.tcs:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.tcs.com/careers/index.html#/careers/AS/IN_default")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.teamcomputers:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.teamcomputers.com/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.techmahinra:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.techmahindra.com/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.threeiinfotech:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://3i-infotech.com/content/careers/")); 
        	   startActivity(websiteIntent);
        	   break;
    	case R.id.trigyn:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.trigyn.com/Careers/JobOpenings.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.tsystems:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.t-systems.com/in/en/career")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.vakrangee:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vakrangee.in/current-openings.php")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.valuelabs:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.valuelabs.com/valuelabs-careers/current-job-postings/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.verizon:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.verizon.com/about/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.virtusa:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.virtusapolaris.com/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.visa:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.visa.co.in/careers.html")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.vmware:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://careers.vmware.com/engineering")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.vsoftconsultinggroup:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vsoftconsulting.com/it-jobs/submit-a-resume/")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.wipro:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://careers.wipro.com/global-india.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.xerox:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.xeroxcareers.com/en-in/default.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.zensar:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.zensar.com/careers")); 
        	   startActivity(websiteIntent);
        	   break;	
    	case R.id.zylogsystems:
    		websiteIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.zsl.com/pages/careers/jobs.aspx")); 
        	   startActivity(websiteIntent);
        	   break;	
    		
    			
    	}
    }
    
    @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
        // Inflate the menu; this adds items to the action bar if it is present.  
        getMenuInflater().inflate(R.menu.main, menu);//Menu Resource, Menu  
        return true;  
    }  
    @Override  
    public boolean onOptionsItemSelected(MenuItem item) {  
        switch (item.getItemId()) {  
            case R.id.aboutme:  
             // Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();  
            	startActivity(new Intent("com.murali.outofboxforstudent.AboutMe"));
            	return true;     
           case R.id.comments:  
               // Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();  
        	   startActivity(new Intent("com.murali.outofboxforstudent.Comments"));
        	   return true;     
           
              default:  
                return super.onOptionsItemSelected(item);  
        }  
    }  

   
    
    
}
