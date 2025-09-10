package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.ar.core.AugmentedFace;
import com.google.ar.core.Session;
import j$.util.Comparator$CC;
import j$.util.DesugarCollections;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtl {
    public final Object a;

    public rtl(Object obj) {
        this.a = obj;
    }

    public static long g(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jG = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jG += g(file2);
            }
        }
        return jG;
    }

    public static int h(tql tqlVar, Object obj, Object obj2) {
        return toy.a((Ctry) tqlVar.c, 1, obj) + toy.a((Ctry) tqlVar.d, 2, obj2);
    }

    public static void i(tos tosVar, tql tqlVar, Object obj, Object obj2) {
        toy.g(tosVar, (Ctry) tqlVar.c, 1, obj);
        toy.g(tosVar, (Ctry) tqlVar.d, 2, obj2);
    }

    private static String l(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = str2 + " [" + TextUtils.join(PNlJufQ.COE, objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized AugmentedFace a(long j, Session session) {
        ?? r0 = this.a;
        Long lValueOf = Long.valueOf(j);
        AugmentedFace augmentedFace = (AugmentedFace) r0.get(lValueOf);
        if (augmentedFace != null) {
            return augmentedFace;
        }
        AugmentedFace augmentedFace2 = new AugmentedFace(j, session);
        r0.put(lValueOf, augmentedFace2);
        return augmentedFace2;
    }

    public final void b(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        try {
            ((Field) this.a).set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void c(seo seoVar) {
        rnt.F(!seoVar.n(), "range must not be empty, but was %s", seoVar);
        this.a.add(seoVar);
    }

    public final void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", l((String) this.a, str, objArr));
        }
    }

    public final void e(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", l((String) this.a, str, objArr), th);
        }
    }

    public final void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", l((String) this.a, str, objArr));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uem] */
    public final teu j(Size size, fnp fnpVar, txk txkVar) {
        ((ezh) this.a.a()).getClass();
        return new teu(size, fnpVar, txkVar);
    }

    public final tej k(tdv tdvVar, tcd tcdVar) {
        tcdVar.getClass();
        ((tgb) this.a).a();
        return new tej(tdvVar);
    }

    public rtl(Ctry ctry, Object obj, Ctry ctry2, Object obj2) {
        this.a = new tql(ctry, obj, ctry2, obj2);
    }

    public rtl(String str) {
        this.a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public rtl(char[] cArr) {
        this.a = new sxy();
    }

    public rtl() {
        this.a = new rtk();
    }

    public rtl(byte[] bArr) {
        this.a = new ArrayList();
    }

    public rtl(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    public rtl(tad tadVar) {
        long size;
        if (tadVar.b() > 0) {
            ArrayList arrayList = new ArrayList(tadVar.b());
            long j = 0;
            if (tadVar.d().isPresent()) {
                arrayList.add(tadVar.d().get());
                size = ((tae) tadVar.d().get()).b;
            } else {
                size = 0;
            }
            ArrayList arrayList2 = new ArrayList(tadVar.b.size());
            for (List list : tadVar.b) {
                arrayList2.add(list != null ? DesugarCollections.unmodifiableList(list) : Collections.EMPTY_LIST);
            }
            Iterator it = arrayList2.iterator();
            long j2 = 1;
            while (it.hasNext()) {
                Iterator it2 = ((Collection) it.next()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new tae(it2.next(), j2));
                }
                size += r8.size() * j2;
                j2 += j2;
            }
            Collections.sort(arrayList, Comparator$CC.comparing(new qoi(13), tadVar.a));
            int i = scs.c;
            scq scqVar = new scq(sel.a);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                tae taeVar = (tae) arrayList.get(i2);
                j += taeVar.b;
                scqVar.f(Double.valueOf(j / size), taeVar.a);
            }
            this.a = scqVar.b();
            return;
        }
        throw new IllegalArgumentException("Empty compactorStack (numStoredItems() < 1). Cannot compute quantiles on zero items.");
    }

    public rtl(uem uemVar, byte[] bArr) {
        uemVar.getClass();
        this.a = uemVar;
    }

    public rtl(uem uemVar) {
        uemVar.getClass();
        this.a = uemVar;
    }
}
