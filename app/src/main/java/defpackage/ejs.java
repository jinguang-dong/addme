package defpackage;

import android.content.Context;
import android.graphics.PathMeasure;
import android.graphics.Region;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;
import androidx.work.impl.WorkDatabase;
import com.google.android.build.data.JKx.wzgaYJqO;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejs {
    public final Object a;

    public ejs(Object obj) {
        this.a = obj;
    }

    public static String c(String str, ejr ejrVar, boolean z) {
        String strReplaceAll = str.replaceAll("\\W+", "");
        String strConcat = ejrVar.c;
        if (z) {
            strConcat = ".temp".concat(String.valueOf(strConcat));
        }
        return "lottie_cache_" + strReplaceAll + strConcat;
    }

    public static ejs p(int i, int i2, int i3, int i4, boolean z) {
        return new ejs(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static ejs q(int i, int i2, int i3) {
        return new ejs(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public static final void y(baz bazVar, int i) {
        while (bazVar.q >= 0 && bazVar.p <= i) {
            bazVar.J();
            bazVar.W();
        }
    }

    public final chq A() {
        throw new IllegalArgumentException(a.bz(this, "The density on DrawerState (", ") was not set. Did you use DrawerState with the Drawer composable?"));
    }

    public final File a() {
        File file = new File(((Context) ((AmbientModeSupport.AmbientController) this.a).a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, ejr ejrVar) throws IOException {
        File file = new File(a(), c(str, ejrVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean d(Class cls) {
        return this.a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    public final urk e(ebx ebxVar) {
        ebxVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((eab) obj).b(ebxVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ske.bq(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((eab) it.next()).a(ebxVar.j));
        }
        return urn.a(new dzw((urk[]) ske.bN(arrayList2).toArray(new urk[0]), 0));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.lang.Object] */
    public final boolean f(ebx ebxVar) throws IOException {
        ebxVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((eab) obj).c(ebxVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            dwj.b();
            int i = dzx.a;
            ske.ca(arrayList, null, null, null, dzu.a, 31);
        }
        return arrayList.isEmpty();
    }

    public final void g(Runnable runnable) {
        ((Handler) this.a).removeCallbacks(runnable);
    }

    public final void h(long j, Runnable runnable) {
        ((Handler) this.a).postDelayed(runnable, j);
    }

    public final void i() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void j(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void k(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void l(cov covVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (covVar != null) {
                view.animate().setListener(new cou(covVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void m(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ScrollFeedbackProvider, java.lang.Object] */
    public final void n(int i, int i2, int i3, boolean z) {
        ((ejs) this.a).a.onScrollLimit(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ScrollFeedbackProvider, java.lang.Object] */
    public final void o(int i, int i2, int i3, int i4) {
        ((ejs) this.a).a.onScrollProgress(i, i2, i3, i4);
    }

    public final void r(AmbientMode.AmbientController ambientController) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(ambientController != null ? new cot(ambientController, 0, 0 == true ? 1 : 0) : null);
        }
    }

    public final chz t() {
        return blb.f(((Region) this.a).getBounds());
    }

    public final void u(chz chzVar) {
        ((Region) this.a).set(chzVar.b, chzVar.c, chzVar.d, chzVar.e);
    }

    public final void v(String str) {
        ((ViewStructure) this.a).setClassName(str);
    }

    public final void w(CharSequence charSequence) {
        ((ViewStructure) this.a).setText(charSequence);
    }

    public final void x(float f, float f2, bkn bknVar) {
        if (!(bknVar instanceof bkn)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        ((PathMeasure) this.a).getSegment(f, f2, bknVar.a, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bbo, java.lang.Object] */
    public final atr z() {
        return (atr) this.a.a();
    }

    public ejs(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ejs(ask askVar) {
        int i = asi.a;
        this.a = new dgk(askVar, new ats(this, 1));
    }

    public final File s(Uri uri) throws IOException {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf != -1) {
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) ((HashMap) this.a).get(strDecode);
            if (file != null) {
                File file2 = new File(file, strDecode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    String path = canonicalFile.getPath();
                    String path2 = file.getPath();
                    if (clv.a(path).startsWith(clv.a(path2) + '/')) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    file2.toString();
                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
                }
            }
            Objects.toString(uri);
            throw new IllegalArgumentException(wzgaYJqO.fJAyTkqEoF.concat(String.valueOf(uri)));
        }
        Objects.toString(uri);
        throw new IllegalArgumentException("Unable to find path from root: ".concat(String.valueOf(uri)));
    }

    public ejs(char[] cArr, byte[] bArr) {
        this.a = new Region();
    }

    public ejs(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new zd(8);
    }

    public ejs(char[] cArr) {
        this.a = new HashMap();
    }

    public ejs(View view, char[] cArr) {
        this.a = ScrollFeedbackProvider.createProvider(view);
    }

    public ejs(short[] sArr) {
        new uxa();
        this.a = new azz(null, bap.c);
    }

    public ejs(View view, byte[] bArr) {
        this.a = new ejs(view, (char[]) null);
    }

    public ejs(View view) {
        this.a = new WeakReference(view);
    }

    public ejs(long[] jArr) {
        yw ywVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            int length = jArrCopyOf.length;
            ywVar = new yw(length);
            int i = ywVar.b;
            jArrCopyOf.getClass();
            if (i < 0) {
                a.bn("");
            }
            if (length != 0) {
                ywVar.a(ywVar.b + length);
                long[] jArr2 = ywVar.a;
                int i2 = ywVar.b;
                if (i != i2) {
                    rnt.ax(jArr2, jArr2, i + length, i, i2);
                }
                rnt.ax(jArrCopyOf, jArr2, i, 0, jArrCopyOf.length);
                ywVar.b += length;
            }
        } else {
            ywVar = new yw((byte[]) null);
        }
        this.a = ywVar;
    }

    public ejs(byte[] bArr) {
        this.a = new bqn(null);
    }

    public ejs() {
        this.a = Handler.createAsync(Looper.getMainLooper());
    }

    public ejs(ebm ebmVar) {
        ebmVar.getClass();
        this.a = ebmVar;
    }

    public ejs(hkk hkkVar) {
        eap eapVar = (eap) hkkVar.a;
        Object obj = hkkVar.b;
        int i = dzx.a;
        Object systemService = ((Context) obj).getSystemService("connectivity");
        systemService.getClass();
        this.a = rnt.ao(new eab[]{new dzz((eap) hkkVar.d), new eaa((eaj) hkkVar.c), new eag((eap) hkkVar.e), new eac(eapVar), new eaf(eapVar), new eae((eap) hkkVar.a), new ead((eap) hkkVar.a), new dzq((ConnectivityManager) systemService)});
    }

    public ejs(WorkDatabase workDatabase, byte[] bArr) {
        workDatabase.getClass();
        this.a = workDatabase;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public ejs(ejt ejtVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap((Map) ejtVar.a));
    }
}
