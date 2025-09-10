package defpackage;

import android.content.ContentResolver;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.build.data.JKx.wzgaYJqO;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import com.google.ar.core.R;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gga {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gga(Camera.ShutterCallback shutterCallback, Camera.PictureCallback pictureCallback, Camera.PictureCallback pictureCallback2, Camera.PictureCallback pictureCallback3) {
        this.c = shutterCallback;
        this.d = pictureCallback;
        this.b = pictureCallback2;
        this.a = pictureCallback3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized String a(String str) {
        return (String) this.b.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final synchronized String b(String str) {
        if (str != null) {
            if (!str.endsWith(":")) {
                str = str.concat(":");
            }
        }
        return (String) this.c.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized String c(String str, String str2) {
        AmbientLifecycleObserverKt.B(str);
        if (str2 == null || str2.length() == 0) {
            throw new edv("Empty prefix", 4);
        }
        if (str2.charAt(str2.length() - 1) != ':') {
            str2 = str2.concat(":");
        }
        if (!eed.e(str2.substring(0, str2.length() - 1))) {
            throw new edv("The prefix is a bad XML name", 201);
        }
        ?? r0 = this.b;
        String str3 = (String) r0.get(str);
        ?? r3 = this.c;
        String str4 = (String) r3.get(str2);
        if (str3 != null) {
            return str3;
        }
        if (str4 != null) {
            int i = 1;
            String str5 = str2;
            while (r3.containsKey(str5)) {
                str5 = str2.substring(0, str2.length() - 1) + "_" + i + GAQqzWiWWcYOgy.YAHTBMarGJGqt;
                i++;
            }
            str2 = str5;
        }
        r3.put(str2, str);
        r0.put(str, str2);
        return str2;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    final synchronized void d(String str, String str2, String str3, String str4, eet eetVar) {
        AmbientLifecycleObserverKt.B(str);
        AmbientLifecycleObserverKt.A(str2);
        AmbientLifecycleObserverKt.B(str3);
        AmbientLifecycleObserverKt.A(str4);
        eet eetVar2 = eetVar != null ? new eet(AmbientLifecycleObserverKt.s(eetVar.b(), null).a) : new eet();
        Object obj = this.d;
        if (((Pattern) obj).matcher(str2).find() || ((Pattern) obj).matcher(str4).find()) {
            throw new edv("Alias and actual property names must be simple", 102);
        }
        String strA = a(str);
        String strA2 = a(str3);
        if (strA == null) {
            throw new edv("Alias namespace is not registered", 101);
        }
        if (strA2 == null) {
            throw new edv("Actual namespace is not registered", 101);
        }
        String strConcat = strA.concat(str2);
        ?? r5 = this.a;
        if (r5.containsKey(strConcat)) {
            throw new edv("Alias is already existing", 4);
        }
        if (r5.containsKey(strA2.concat(str4))) {
            throw new edv("Actual property is already an alias, use the base property", 4);
        }
        r5.put(strConcat, new eep(str3, strA2, str4, eetVar2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized eep e(String str) {
        return (eep) this.a.get(str);
    }

    public final /* synthetic */ void f(Runnable runnable) {
        ((edb) this.b).execute(runnable);
    }

    public final void g(jub jubVar) {
        ((out) this.d).execute(new imf(this, jubVar, 19));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, uem] */
    public final /* bridge */ /* synthetic */ iou h(nkw nkwVar, iqh iqhVar, int i, sqg sqgVar, boolean z, iqm iqmVar) {
        gnt gntVar = (gnt) this.a.a();
        gntVar.getClass();
        owf owfVar = (owf) this.b.a();
        owfVar.getClass();
        ndj ndjVar = (ndj) this.d.a();
        ndjVar.getClass();
        mdy mdyVar = (mdy) this.c.a();
        mdyVar.getClass();
        nkwVar.getClass();
        iqhVar.getClass();
        sqgVar.getClass();
        iqmVar.getClass();
        return new iou(gntVar, owfVar, ndjVar, mdyVar, nkwVar, iqhVar, i, sqgVar, z, iqmVar);
    }

    public gga(eie eieVar, eie eieVar2, eif eifVar, eif eifVar2) {
        this.a = eieVar;
        this.b = eieVar2;
        this.d = eifVar;
        this.c = eifVar2;
    }

    public gga(izm izmVar, izc izcVar, izh izhVar, jai jaiVar) {
        this.a = izmVar;
        this.b = izcVar;
        this.c = izhVar;
        this.d = jaiVar;
    }

    public gga(Object obj, Object obj2, Object obj3, Object obj4) {
        this.d = obj;
        this.b = obj2;
        this.a = obj3;
        this.c = obj4;
    }

    public gga(List list, ero eroVar, etl etlVar, ContentResolver contentResolver) {
        this.c = eroVar;
        this.a = etlVar;
        this.b = contentResolver;
        this.d = list;
    }

    public gga(jpb jpbVar, jsf jsfVar, owf owfVar, kgw kgwVar) {
        this.c = jpbVar;
        this.a = jsfVar;
        this.d = owfVar;
        this.b = kgwVar;
    }

    public gga(kfg kfgVar, jtd jtdVar, kgw kgwVar, out outVar) {
        this.c = kfgVar;
        this.b = jtdVar;
        this.a = kgwVar;
        this.d = outVar;
    }

    public gga(owf owfVar, our ourVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.a = owfVar;
        this.c = ourVar;
        this.b = executor;
        this.d = scheduledExecutorService;
    }

    public gga(pfu pfuVar, peo peoVar, pdv pdvVar, klf klfVar) {
        this.c = pfuVar;
        this.d = peoVar;
        this.a = pdvVar;
        this.b = klfVar;
    }

    public gga(pfu pfuVar, peq peqVar, gaw gawVar, kuj kujVar) {
        this.d = pfuVar;
        this.a = peqVar;
        this.b = gawVar;
        this.c = kujVar;
    }

    public gga(Executor executor) {
        this.a = new Handler(Looper.getMainLooper());
        this.c = new edk(this);
        edb edbVar = new edb(executor);
        this.b = edbVar;
        this.d = ujp.aa(edbVar);
    }

    public gga(mdy mdyVar, mes mesVar, nkw nkwVar, nkw nkwVar2) {
        this.b = mdyVar;
        this.a = nkwVar;
        this.c = nkwVar2;
        this.d = (mex) mesVar.a();
        String.valueOf(nkwVar);
        String.valueOf(nkwVar2);
    }

    public gga(pbb pbbVar, Set set, out outVar, hbc hbcVar) {
        this.c = pbbVar.a("ImageSaverValidator");
        this.b = set;
        this.a = outVar;
        this.d = hbcVar;
    }

    public gga(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.c = uemVar2;
        uemVar3.getClass();
        this.d = uemVar3;
        uemVar4.getClass();
        this.a = uemVar4;
    }

    public gga(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, byte[] bArr, byte[] bArr2) {
        uemVar.getClass();
        this.a = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
        uemVar3.getClass();
        this.d = uemVar3;
        uemVar4.getClass();
        this.c = uemVar4;
    }

    public gga(View view) {
        this.d = (ImageView) view.findViewById(R.id.menu_item_icon);
        this.c = (TextView) view.findViewById(R.id.menu_item_title);
        this.a = (TextView) view.findViewById(R.id.menu_item_description);
        this.b = (ImageButton) view.findViewById(R.id.menu_item_help_button);
    }

    public gga() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = new HashMap();
        this.d = Pattern.compile("[/*?\\[\\]]");
        try {
            c("http://www.w3.org/XML/1998/namespace", "xml");
            c("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
            c("http://purl.org/dc/elements/1.1/", "dc");
            c("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
            c("adobe:ns:meta/", "x");
            c("http://ns.adobe.com/iX/1.0/", "iX");
            c("http://ns.adobe.com/xap/1.0/", "xmp");
            c("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
            c("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
            c("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
            c("http://ns.adobe.com/xmp/note/", "xmpNote");
            c("http://ns.adobe.com/pdf/1.3/", "pdf");
            c("http://ns.adobe.com/pdfx/1.3/", "pdfx");
            c("http://www.npes.org/pdfx/ns/id/", "pdfxid");
            c("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
            c("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
            c("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
            c("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
            c("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
            c("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
            c("http://ns.adobe.com/photoshop/1.0/", "photoshop");
            c("http://ns.adobe.com/album/1.0/", "album");
            c("http://ns.adobe.com/exif/1.0/", "exif");
            c("http://ns.adobe.com/exif/1.0/aux/", "aux");
            c("http://ns.adobe.com/tiff/1.0/", "tiff");
            c("http://ns.adobe.com/png/1.0/", "png");
            c("http://ns.adobe.com/jpeg/1.0/", "jpeg");
            c("http://ns.adobe.com/jp2k/1.0/", "jp2k");
            c("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
            c(LmJPKwPBa.apGEuetdQWfqQOs, "bmsp");
            c("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
            c("http://ns.adobe.com/asf/1.0/", "asf");
            c("http://ns.adobe.com/xmp/wav/1.0/", "wav");
            c("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
            c("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
            c("http://ns.adobe.com/xap/1.0/t/", "xmpT");
            c(KsvNaXS.jtYtVBhYS, "xmpTPg");
            c("http://ns.adobe.com/xap/1.0/g/", "xmpG");
            c("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
            c("http://ns.adobe.com/xap/1.0/sType/Font#", "stFNT");
            c("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
            c("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
            c("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
            c("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
            c("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
            c("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
            c("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
            eet eetVar = new eet();
            eetVar.f(1536, true);
            eet eetVar2 = new eet();
            eetVar2.f(7680, true);
            d("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", UvOvSgfD.vHCxdgUMeEWNZQ, eetVar);
            d("http://ns.adobe.com/xap/1.0/", CGlJpiVWrCQOq.ZcUqskZQaGg, "http://purl.org/dc/elements/1.1/", "creator", null);
            d("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
            d("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
            d("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            d("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
            d("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", null);
            d(KsvNaXS.rXGcUVXZQh, "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            d("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", eetVar);
            d("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
            d("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            d("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            d("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            d("http://ns.adobe.com/pdf/1.3/", "Subject", LmJPKwPBa.EmvkIIktdEv, "description", eetVar2);
            d("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", eetVar2);
            d("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", eetVar);
            d("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", eetVar2);
            d("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", eetVar2);
            d("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            d("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
            d("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", eetVar2);
            d("http://ns.adobe.com/photoshop/1.0/", MyBPCgKwEjJI.ZKQe, "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
            d("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", eetVar);
            d("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            d(LmJPKwPBa.fQQaQmdjXiQ, "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            d("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
            d(zflNUOOzDfM.OtUYjOU, "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            d("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", eetVar);
            d("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", eetVar2);
            d("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            d("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", eetVar2);
            d(wzgaYJqO.MJGgEDSr, "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            d("http://ns.adobe.com/png/1.0/", oUZhwRhE.WMvgMlXcwZM, "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            d("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", eetVar2);
        } catch (edv unused) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    public gga(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, byte[] bArr) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.d = uemVar2;
        uemVar3.getClass();
        this.a = uemVar3;
        uemVar4.getClass();
        this.c = uemVar4;
    }
}
