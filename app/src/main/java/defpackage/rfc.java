package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfc {
    public static final una a = new uoe(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 2, TimeUnit.SECONDS, new SynchronousQueue(), new rez())).g(Runtime.getRuntime().availableProcessors());
    public static final upw b;
    public final List c;
    private final Matrix d;
    private final RectF e;
    private final Rect f;
    private final ues g;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        int i = upx.a;
        b = new upv(handler, null);
    }

    public rfc() {
        this(ufw.a);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, rev] */
    public final rff a(View view, int i, int i2, Map map) {
        rfe rfeVar = new rfe();
        rfeVar.e("hierarchy_depth", i);
        rfeVar.e("index", i2);
        rfv rfvVar = (rfv) map.remove(view);
        if (rfvVar != null) {
            rfeVar.e("hierarchy_height", rfvVar.a);
        }
        String name = view.getClass().getName();
        name.getClass();
        rfeVar.b("class", name);
        String packageName = view.getContext().getPackageName();
        packageName.getClass();
        rfeVar.b("package", packageName);
        rfeVar.e("hashcode", view.hashCode());
        String strC = qsz.c(view.getResources(), view.getId());
        if (strC != null) {
            rfeVar.b("resource_id", strC);
        }
        Matrix matrix = this.d;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        RectF rectF = this.e;
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        Rect rect = this.f;
        rect.set(ukj.x(rectF.left), ukj.x(rectF.top), ukj.x(rectF.right), ukj.x(rectF.bottom));
        String shortString = rect.toShortString();
        shortString.getClass();
        rfeVar.b("bounds", shortString);
        List list = this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((rnu) it.next()).a.a(rfeVar, view);
        }
        if (a.ao(view.getClass().getName(), "androidx.compose.ui.platform.ComposeView")) {
            if (list.isEmpty()) {
                rfe rfeVar2 = new rfe();
                rfeVar2.b("class", "🚀 🚀 🚀 See go/hsv-compose 🚀 🚀 🚀");
                rfeVar2.b("bounds", shortString);
                rfeVar2.b("description", "HSV has support for Compose, but an extension needs to be installed to use it. See go/hsv-compose for more info.");
                rfeVar2.b("go link", "go/hsv-compose");
                rfeVar.g(rfeVar2.a());
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (a.ao(((rnu) it2.next()).getClass().getName(), "com.google.android.libraries.view.hierarchysnapshotter.compose.ComposeExtension")) {
                        break;
                    }
                }
                rfe rfeVar22 = new rfe();
                rfeVar22.b("class", "🚀 🚀 🚀 See go/hsv-compose 🚀 🚀 🚀");
                rfeVar22.b("bounds", shortString);
                rfeVar22.b("description", "HSV has support for Compose, but an extension needs to be installed to use it. See go/hsv-compose for more info.");
                rfeVar22.b("go link", "go/hsv-compose");
                rfeVar.g(rfeVar22.a());
            }
        }
        if (view instanceof ViewGroup) {
            int i3 = i + 1;
            ViewGroup viewGroup = (ViewGroup) view;
            Iterator itA = new coq(viewGroup, 1).a();
            int i4 = 0;
            while (itA.hasNext()) {
                Object next = itA.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    ske.bp();
                }
                rfeVar.g(a((View) next, i3, i4, map));
                i4 = i5;
            }
            uiq uiqVar = (uiq) this.g.a();
            ViewGroupOverlay overlay = viewGroup.getOverlay();
            overlay.getClass();
            ViewGroup viewGroup2 = (ViewGroup) uiqVar.a(overlay);
            if (viewGroup2 != null && viewGroup2.getChildCount() != 0) {
                rfeVar.g(a(viewGroup2, i3, -1, map));
            }
        }
        return rfeVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.view.View r21, java.io.OutputStream r22, defpackage.uhf r23, defpackage.uhb r24) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfc.b(android.view.View, java.io.OutputStream, uhf, uhb):java.lang.Object");
    }

    public final rfv c(View view, Map map) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        int i = 1;
        if (viewGroup != null) {
            Iterator itA = new coq(viewGroup, 1).a();
            int iN = 1;
            while (itA.hasNext()) {
                iN = ukc.n(iN, c((View) itA.next(), map).a + 1);
            }
            i = iN;
        }
        rfv rfvVar = new rfv(i);
        map.put(view, rfvVar);
        return rfvVar;
    }

    public rfc(List list) {
        this.c = list;
        this.d = new Matrix();
        this.e = new RectF();
        this.f = new Rect();
        this.g = rnt.aO(3, new bfw(15));
    }

    public final void d(rff rffVar, XmlSerializer xmlSerializer, qas qasVar) {
        String str;
        String str2 = mPfBwqXsnpXI.mLfFgV;
        xmlSerializer.startTag(str2, "node");
        rfp rfpVar = new rfp();
        BitSet bitSet = new BitSet();
        List list = rffVar.b;
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ske.bp();
            }
            rfd rfdVar = (rfd) obj;
            List list2 = rfdVar.c;
            String str3 = rfdVar.a;
            if (!ujp.r(str3) && (str = rfdVar.b) != null && !rfpVar.a.containsKey(str3)) {
                bitSet.set(i2);
                rfpVar.b(str3, str);
            }
            i2 = i3;
        }
        rfpVar.a(xmlSerializer, qasVar);
        for (Object obj2 : list) {
            int i4 = i + 1;
            if (i < 0) {
                ske.bp();
            }
            rfd rfdVar2 = (rfd) obj2;
            if (!bitSet.get(i)) {
                xmlSerializer.startTag(str2, "a");
                rfp rfpVar2 = new rfp();
                String str4 = rfdVar2.a;
                if (!ujp.r(str4)) {
                    rfpVar2.b("name", qasVar.d(str4));
                }
                String str5 = rfdVar2.b;
                if (str5 != null) {
                    rfpVar2.b("value", str5);
                }
                rfpVar2.a(xmlSerializer, qasVar);
                List list3 = rfdVar2.c;
                xmlSerializer.endTag(str2, "a");
            }
            i = i4;
        }
        Iterator it = rffVar.a.iterator();
        while (it.hasNext()) {
            d((rff) it.next(), xmlSerializer, qasVar);
        }
        xmlSerializer.endTag(str2, "node");
    }
}
