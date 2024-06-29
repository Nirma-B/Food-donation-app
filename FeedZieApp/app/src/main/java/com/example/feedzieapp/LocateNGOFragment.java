package com.example.feedzieapp;


import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LocateNGOFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragement_locate_ngo, container, false);

        ArrayList<NgoInfo> ngoInfo = new ArrayList<>();

        ngoInfo.add(new NgoInfo("Snehalaya",
                "Snehalaya means 'Home of Love', and was founded in 1989 to provide support for women, children and LGBT communities, who have been affected by HIV and AIDS, trafficking, sexual violence, and poverty. We operate in Ahmednagar, a town and district in the agricultural region of Maharashtra, India, and provide services to over 15,000 beneficiaries annually.  \n" +
                        "\u200B\n" +
                        "We are more than an NGO, we are a strong and passionate family, united in the belief that no one should stand alone.  Many of our staff first came to us as beneficiaries to use our services.  We understand that resilience - the desire to survive - is an extraordinary force.  A sense of belonging and compassion can nurture even the most destitute and fragile people to not just survive, but to thrive in life. We welcome everyone with an open heart and without prejudice.  \n" +
                        "\n" +
                        "Anand Nagar, Awhalwadi Road, Wagholi, Pune - 412207, Next to Ashirwad Hotel .\n" +
                        "9822580248",
                R.drawable.five));


        ngoInfo.add(new NgoInfo("Think Sharp Foundation","To improve the quality of rural education in schools and after schools hours by providing access to better educational infrastructure includes digital tools, library, games, financial support and creating progressive and positive learning environment by working with the village community, teachers, government and other stakeholders\n" +
                "Flat no 1401, Bld NO 4B,\n" +
                "Dreams Complex, LBS Road, Bhandup West, Mumbai 400078\n" +
                "\n" +
                "Aspire Tower 2, Flat No.1701, 17th Floor,\n" +
                "Amanora Park Town, Hadapsar, Pune 411028\n" +
                " +91 9892742011 \n" +
                "info@thinksharpfoundation.org",
                R.drawable.one));

        ngoInfo.add(new NgoInfo("Manuski Old Age Home",
                "07947198182\n" +
                        "Survey No 253 Plot No 36D/37A, Lohgoan Road, Lane No 18, IAF Station, Pune - 411032, Near IAF Station \n",
                R.drawable.two));

        ngoInfo.add(new NgoInfo("Seva Deep",
                "To seed a culture of giving that is responsive to the needs of the recipient NGO\n" +
                        "To authenticate each NGO’s identity before on-boarding them\n" +
                        "To build an ecosystem of giving that is pan India in outreach\n" +
                        "To leverage technology to the maximum for humanitarian causes\n" +
                        "To communicate with the donors the entire cycle from the point of donation to its end use\n" +
                        "Inspire more citizens by projecting work done by donors and NGOs\n" +
                        "14th floor, Sky One, KalyaniNagar, Pune 411006, MH India\n" +
                        "+91 9175201229 & +91 9518541719",
                R.drawable.three));

        ngoInfo.add(new NgoInfo("The Power Of One",
                "Power of one has initiated distribution of Oxygen Cylinder too needy in spike of Corona cases and less supply chain of oxygen cylinder for citizen's. Your small contribution can help save many life.\n" +
                        "Address: Plot No 32, Central Excise Colony, Sneh Nagar, Near Chhatrapati Sq, Wardha Rd, Nagpur- 440015.\n" +
                        "Email: ngopowerofone@gmail.com\n" +
                        "Phone: +91-8956496198",
                R.drawable.four));


        ngoInfo.add(new NgoInfo("Compassion Charitable Trust",
                "In the suburbs of Mumbai (Bombay) a special couple are doing an amazing and unique work. They are ministering to some of the thousands of street/slum dwellers. What makes the whole thing even more remarkable is that this COUPLE has next to nothing themselves! Their home is tiny, they have no transport and no guaranteed income yet despite that, they wash, feed and teach these destitute children daily. They are totally cast upon the Lord God Almighty.\n" +
                        "\n" +
                        "Survey No 1, Sai Prithvi Galaxy, Vadgaon Sheri, Pune - 411014, Near Bhaji Market\n" +
                        "8999012209",
                R.drawable.six));

        ngoInfo.add(new NgoInfo("VIBGYOR Foundation",
                "It has been more than 5 years since a bunch of twenty youngsters undertook a visit to a local orphanage under the name of VIBGYOR Foundation. The foundation has grown enormously from those initial days as we undertook activities ranging from environmental to cleanliness to conducting educational workshops and giving a platform to our divyang brothers and sisters to showcase their talent.\n" +
                        "\n" +
                        "B25, Audumbar Society, Kondhwa Bibvewadi Road, Market Yard, Pune - 411037, Gangadham Chowk\n" +
                        "7798397966",
                R.drawable.seven));

        ngoInfo.add(new NgoInfo("Pratham Shikshan Mandal",
                "Survey No 35, Kalepadal Road, Hadapsar, Pune - 411028, Ganesh Temple Chowk, Near Pragati Vidhyalay \n" +
                        "07947198061",
                R.drawable.eight));

        ngoInfo.add(new NgoInfo("Pushpa Foundation",
                " It first says an NGO is any non-profit, voluntary citizens' group which is organized on a local, national or international level, but then goes on to restrict the meaning in the sense used by most English speakers and the media: Task-oriented and driven by people with a common interest, NGOs perform a variety of service and humanitarian functions,.\n" +
                        "\n" +
                        "Flat No 204, Kreepa Heritage, Gat No 85 Plot No 71, Kadamwak Wasti, Loni Kalbhor, Pune - 412201, Nr Loni Kalbhor Station\n" +
                        "9860421216",
                R.drawable.nine));

        ngoInfo.add(new NgoInfo("Feeding India",
                "194 million people in India today do not have enough food to eat, the largest in any one country in the world. According to the Global Hunger Index 2020, India falls under the ‘serious’ hunger category with a rank of 94 among 107 countries.\n" +
                        "\n" +
                        "These statistics however, do not take into account the effects of COVID-19. The resultant migration, unemployment and loss of earning members of households has pushed millions of Indians into extreme poverty and hunger.\n" +
                        "\n" +
                        "Pimpri, Pune - 411018, Nr Pimpri\n" +
                        "+91 8888888881",
                R.drawable.ten));



        NgoInfoAdapter adapter = new NgoInfoAdapter(getActivity(),ngoInfo);

        ListView listView = (ListView) root.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return root;
    }

}