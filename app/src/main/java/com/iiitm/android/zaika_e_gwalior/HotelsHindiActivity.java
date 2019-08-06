package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shivam on 12/19/2017.
 */

public class HotelsHindiActivity extends AppCompatActivity{

    public List<Adapterhotel> adapterhotelList = new ArrayList<>();
    Context mContext;
    MovieAdapterhotel movieAdapterhotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("होटल");
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieAdapterhotel = new MovieAdapterhotel(adapterhotelList,this);
        recyclerView.setAdapter(movieAdapterhotel);
        prePareMovieData();

    }

    private void prePareMovieData() {


        int[] covers = new int[]{
                R.drawable.royalinn,
                R.drawable.grace,
                R.drawable.regency,
                R.drawable.lmark,
                R.drawable.cpark,
                R.drawable.shelter,
                R.drawable.tanseeen, R.drawable.ukiranplace,

        };
        Adapterhotel a = new Adapterhotel(covers[0],"रॉयल इन ","सिटी सेंटर, ग्वालियर","24 hours",
                "ग्वालियर के दिल में स्थित, होटल रॉयल इन, ग्वालियर के सबसे खूबसूरत भोज हॉल में मेजबानी करता है और हर मेहमान की आतिथ्य आवश्यकताओं को पूरा करने के लिए लोकप्रिय रेस्तरां के अतिरिक्त है। यह कई सुविधाएं प्रदान करता है जैसे टेलीविजन कक्ष, जलवायु नियंत्रण, डेस्क, केबल / सैटेलाइट टीवी , एयर कंडीशनिंग रूम, चाइल्ड केयर, इंटरनेट एक्सेस, वॉकअप कॉल, रीडिंग लैंप, रूम में बोतलबंद पानी, मुद्रा विनिमय, व्यापार सुविधाएं, विकलांग सुविधाएं, डॉक्टर ऑफ कॉल, एक्ज़िबिट स्पेस, कॉन्फ्रेंस हॉल, वेडिंग सर्विसेज, बार, कॉफी शॉप / कैफे , सुरक्षा गार्ड। "," रॉयल इन होटल, सिटी सेंटर रोड \n "+
                "ग्वालियर, मध्य प्रदेश - 474011", "स्टैंडर्ड रूम 2200 INR \n डेलक्स कक्ष 2700 INR \n विशेष सट कक्ष 5000 INR", "0751234 0892","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[1], "ग्रेस होटल","Gandhi Road,Gwalior","24 hours",
                 "ग्रेस होटल में बड़े वेंटिलेशन और प्राकृतिक हवा उपलब्ध बालकनियों के साथ विशाल कमरे हैं। कमरे की सुविधा में संलग्न स्नान, गर्म और ठंडे पानी, रेफ्रिजरेटर, केबल रंगीन टीवी और डायरेक्ट डायल सेवा शामिल हैं। होटल की सुविधा में घड़ी की कक्ष सेवा, फोन पर चिकित्सक, यात्रा डेस्क, उसी दिन कपड़े धोने और जनरेटर बैक अप शामिल हैं। होटल सभी प्रमुख क्रेडिट कार्ड स्वीकार करता है। , मानिक विलास कॉलोनी, गांधी रोड" ,"ग्वालियर, मध्य प्रदेश - 474002,एसी डेलक्स रूम 1100 INR, एक्सीक्यूटिव रूम 1450 INR",
                        " एसी सीट कक्ष 1950 INR","+918191900022 ","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[2],"ग्वालियर रीजेंसी होटल","गांधी रोड, ग्वालियर","24 hours",
                "ग्वालियर रीजेंसी होटल काम और अवकाश के लिए एक अनुकूल माहौल सुनिश्चित करता है कक्ष सेवा, 24 घंटे के फ्रंट डेस्क, एयर कंडीशनिंग, लिफ्ट, कपड़े धोने, पार्किंग, यात्रा डेस्क और 24 घंटे की सुरक्षा बुनियादी सेवाएं हैं। व्यापार सुविधाओं का सेट सम्मेलन सुविधाओं, व्यापार सेवाओं, ऑडियो विजुअल उपकरण, सम्मेलन सूट, बैठक की सुविधा और बैठक के कमरे शामिल हैं। मेहमान मल्टी-व्यंजन परोस रेस्तरां, ब्लू फॉक्स में शानदार भारतीय, चीनी, मुगलई और कॉन्टिनेंटल व्यंजनों में शामिल होने का आनंद ले रहे हैं। ब्लैक कैडिलैक बार, संरक्षक को अंतरराष्ट्रीय विदेशी मादक पेय प्रदान करता है।", " ग्वालियर रीजेंसी होटल, गांधी रोड,ग्वालियर, मध्य प्रदेश  474002", "ेलक्स रूम 3500 INR एक्जीक्यूटिव रूम 4800 INR  ग्रांड ड्यूलेक्स कमरा 4800 INR", " 917417300033","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[3],"लैंडमार्क होटल","माणिक विलास कॉलोनी, ग्वालियर","24 hours",
                "लैंडमार्क होटल, ग्वालियर विविध व्यंजनों से व्यंजनों का एक रोमांचक रेंज प्रदान करता है। डीलक्स, सुपर डीलक्स, सूट और फॅमिली रूम मेहमानों को पेश किए जाने वाले आवास प्रकार के चार रूप हैं। कमरे में उपलब्ध कुछ सुविधाएं एयर कंडीशनर, सोफे, टेलीविजन, चाय / कॉफी निर्माता और मिनी फ्रिज हैं। नियमित सुविधाएं से सम्पत्ति एक फ्रंट डेस्क की तरह है, कॉल पर चिकित्सक, कपड़े धोने की सेवाएं, होटल व्यावसायिक उद्देश्यों के लिए आदर्श है क्योंकि यह सम्मेलन सुविधाएं, व्यावसायिक सेवाओं, ऑडियो विजुअल उपकरण, सम्मेलन सूट और बैठक सुविधाएं प्रदान करता है। निस्संदेह यह ग्वालियर मध्य प्रदेश में सबसे अच्छे होटल में से एक है।" ,"47, मानिक विलास कॉलोनी, रेलवे स्टेशन के पास, ग्वालियर, मध्य प्रदेश 474002","अधिकतम कमरे का दर: 4000 रुपये न्यूनतम न्यूनतम दर: 2500 INR", "07514011271","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[4],"सेंट्रल पार्क होटल","सिटी सेंटर, ग्वालियर","24 hours",
                "सेंट्रल पार्क होटल आरामदायक और परेशानी मुक्त रहने के लिए आधुनिक सुविधाएं उपलब्ध कराता है। प्राथमिक सेवाओं में कमरे की सेवा, इंटरनेट का उपयोग, 24-घंटा फ्रंट डेस्क, एयर कंडीशनिंग, लिफ्ट, पार्किंग, यात्रा डेस्क और 24 घंटे की सुरक्षा शामिल है। कॉर्पोरेट बैठक और सम्मेलनों की व्यवस्था के लिए एक व्यापार केंद्र प्रदान किया गया है। व्यापार केंद्र के अंदर सुविधाएं सम्मेलन सुविधाओं, व्यवसाय सेवाओं, ऑडियो विजुअल उपकरण, एलसीडी / प्रोजेक्टर, सम्मेलन सूट और बैठक सुविधाएं शामिल हैं। जिम, पूल, फूलों की दुकान और स्वास्थ्य क्लब पूर्ण कायाकल्प सुनिश्चित करते हैं सामुदायिक समारोहों के लिए भोज सुविधाएं एक अतिरिक्त लाभ हैं मल्टी-व्यंजन खाने के आउटलेट, कैफे रॉयल में एक टेंटलाइजिंग पेटू व्यवहार का आनंद लिया जा सकता है; होटल कॉम्प्लेक्स के अंदर एक कॉफी शॉप, रोज़बुड और एक अच्छी तरह से बने बार।","सिटी सेंटर, माधव राव सिंधिया मार्ग, विशाल विशाल मेगमर्ट, पटेल नगर, ग्वालियर, मध्य प्रदेश 474001 "," अधिकतम कमरा दर: 7500 INR\n" +
                        " न्यूनतम कक्ष दर: 3500 INR"," 07512232440","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[5],"होटल Shelter","तानसेन रोड, ग्वालियर","24 hours",
                "होटल काम और अवकाश के लिए एक अनुकूल माहौल सुनिश्चित करता है कक्ष सेवा, 24 घंटे के फ्रंट डेस्क, एयर कंडीशनिंग, लिफ्ट, कपड़े धोने, पार्किंग, यात्रा डेस्क और 24 घंटे की सुरक्षा बुनियादी सेवाएं हैं। व्यापार सुविधाओं का सेट सम्मेलन सुविधाओं, व्यापार सेवाओं, ऑडियो विजुअल उपकरण, सम्मेलन सूट, बैठक की सुविधा और बैठक के कमरे शामिल हैं। मेहमान मल्टी-व्यंजन परोस रेस्तरां, ब्लू फॉक्स में शानदार भारतीय, चीनी, मुगलई और कॉन्टिनेंटल व्यंजनों में शामिल होने का आनंद ले रहे हैं। ब्लैक कैडिलैक बार, संरक्षक को अंतरराष्ट्रीय विदेशी मादक पेय प्रदान करता है।",
                 "निकट रेलवे स्टेशन, तानसेन रोड, पदव, ग्वालियर, मध्य प्रदेश 474002 "," अधिकतम कमरा दर: 6500 रुपये, न्यूनतम कक्ष दर: 2200 रुपये","07512376209","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[6],"तानसेन रेजीडेंसी ","Thatipur, ग्वालियर","24 hours",
                "रहने के लिए सुविधाजनक और सुखद बनाने के लिए मेहमानों को कई विशेषताओं की पेशकश की जाती है। बुनियादी सुविधाओं में मेहमान इंटरनेट, 24 घंटे का फ्रंट डेस्क, 24-घंटे रूम सर्विस, लिफ्ट, बच्चा बैठे, पार्किंग, यात्रा डेस्क, पहिया कुर्सी का उपयोग और 24 घंटे की सुरक्षा प्रदान करते हैं। व्यावसायिक केंद्र, ऑडियो विजुअल उपकरण कॉर्पोरेट मेहमानों की जरूरतों को पूरा करते हैं। मेहमान स्वादिष्ट भोजन का स्वाद ले सकते हैं और इन-हाउस रेस्तरां और बार में क्रमशः उत्कृष्ट शराब का आनंद ले सकते हैं। कोई भी कॉफी की गर्मियों में घुटन का आनंद ले सकता है और कॉफी शॉप में हल्का नाश्ता चूम सकता है।",
                 "एलएनयुपीई कैम्पस, दीतिपुर, ग्वालियर, मध्य प्रदेश 474002 "," अधिकतम कमरा दर: 3300 INR\n" +
                        " न्यूनतम कक्ष दर: 2300 INR","07512340370","hjhjjh");
        adapterhotelList.add(a);


        a = new Adapterhotel(covers[7],"ताज उषा किरण प्लेस ","लश्कर, ग्वालियर","24 hours",
                "ताज उषा किरण पैलेस में एक बालकनी और वाईफ़ाई पहुंच उपलब्ध है। एक पूर्ण-सेवा स्पा के साथ, इस होटल में एक रेस्तरां और एक आउटडोर पूल है। सार्वजनिक क्षेत्रों में नि: शुल्क वाईफाई और मुफ्त स्वयं पार्किंग भी प्रदान किए जाते हैं। इसके अतिरिक्त, एक फिटनेस सेंटर, एक कॉफी शॉप / कैफे, व्यवसाय सेवाएं, सम्मेलन सूट, कॉकटेल लाउंज, निशुल्क समाचार पत्र, बैठक की सुविधा, सम्मेलन हॉल, जिम आदि।",
                "जयन्द्रगंज लश्कर, ग्वालियर, मध्य प्रदेश 474009 "," अधिकतम कमरा दर: 38000 रुपये\n" +
                        " न्यूनतम कक्ष दर: 7000 रुपये"," 07512444000","hjhjjh");
        adapterhotelList.add(a);





    }
}
