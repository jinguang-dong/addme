package defpackage;

import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.util.Xml;
import android.view.Display;
import android.view.View;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rfb extends uht implements uiu {
    final /* synthetic */ uka a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfb(OutputStream outputStream, rfp rfpVar, rfc rfcVar, uka ukaVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.b = outputStream;
        this.c = rfpVar;
        this.d = rfcVar;
        this.a = ukaVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((rfb) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((rfb) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws IllegalStateException, IOException, IllegalArgumentException {
        if (this.e == 0) {
            rnt.aN(obj);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            xmlSerializerNewSerializer.setOutput((OutputStream) this.b, StandardCharsets.UTF_8.name());
            xmlSerializerNewSerializer.startDocument("UTF-8", true);
            xmlSerializerNewSerializer.startTag("", "hierarchy");
            ((rfp) this.c).a(xmlSerializerNewSerializer, null);
            qas qasVar = new qas();
            rff rffVar = (rff) this.a.a;
            xmlSerializerNewSerializer.getClass();
            ((rfc) this.d).d(rffVar, xmlSerializerNewSerializer, qasVar);
            xmlSerializerNewSerializer.startTag("", "attributeNameMap");
            ?? r4 = qasVar.a;
            int size = r4.size();
            for (int i = 0; i < size; i++) {
                String str = (String) r4.get(i);
                xmlSerializerNewSerializer.attribute("", (String) qasVar.b.get(str), str);
            }
            xmlSerializerNewSerializer.endTag("", "attributeNameMap");
            xmlSerializerNewSerializer.endTag("", "hierarchy");
            xmlSerializerNewSerializer.endDocument();
            return ufg.a;
        }
        rnt.aN(obj);
        for (rnu rnuVar : ((rfc) this.c).c) {
        }
        Object obj2 = this.b;
        rfp rfpVar = (rfp) obj2;
        rfpVar.b("os_version", Build.VERSION.RELEASE);
        rfpVar.b("os_version_incremental", Build.VERSION.INCREMENTAL);
        rfpVar.e("api_level", Build.VERSION.SDK_INT);
        rfpVar.b("device", Build.DEVICE);
        rfpVar.b("model", Build.MODEL);
        rfpVar.b("product", Build.PRODUCT);
        Object obj3 = this.d;
        int[] iArr = con.a;
        View view = (View) obj3;
        Display display = view.getDisplay();
        if (display != null) {
            Point point = new Point();
            display.getSize(point);
            rfpVar.e("display_width", point.x);
            rfpVar.e("display_height", point.y);
            rfpVar.e("rotation", display.getRotation());
        }
        String packageName = view.getContext().getApplicationContext().getPackageName();
        rfpVar.b("package", packageName);
        try {
            ((rfp) obj2).b("app_version", ((View) obj3).getContext().getPackageManager().getPackageInfo(packageName, 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj4 = this.c;
        View view2 = (View) this.d;
        rfc rfcVar = (rfc) obj4;
        rfcVar.c(view2, linkedHashMap);
        this.a.a = rfcVar.a(view2, 0, 0, linkedHashMap);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.e != 0) {
            Object obj2 = this.c;
            Object obj3 = this.b;
            return new rfb((rfc) obj2, (rfp) obj3, (View) this.d, this.a, uhbVar, 1);
        }
        Object obj4 = this.b;
        Object obj5 = this.c;
        return new rfb((OutputStream) obj4, (rfp) obj5, (rfc) this.d, this.a, uhbVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfb(rfc rfcVar, rfp rfpVar, View view, uka ukaVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = rfcVar;
        this.b = rfpVar;
        this.d = view;
        this.a = ukaVar;
    }
}
