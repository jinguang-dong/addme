package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.preference.Preference;
import androidx.wear.ambient.AmbientMode;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.googlex.gcam.Tuning;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jod {
    public final Object a;
    public final Object b;

    public jod(Preference preference) {
        this.b = "camera.onscreen_logcat_filter";
        this.a = preference;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized List B(String str) {
        ?? r0 = this.a;
        if (!r0.contains(str)) {
            r0.add(str);
        }
        ?? r02 = this.b;
        List list = (List) r02.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        r02.put(str, arrayList);
        return arrayList;
    }

    public static void h(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            String.valueOf(audioDeviceInfo.getProductName());
            audioDeviceInfo.getType();
            audioDeviceInfo.getId();
        }
    }

    public static final void i() {
        gzi gziVar = gyi.a;
    }

    public static final esw r(ImageDecoder.Source source, int i, int i2, eqm eqmVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new evz(i, i2, eqmVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new exv((AnimatedImageDrawable) drawableDecodeDrawable, 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(drawableDecodeDrawable))));
    }

    public static final boolean s(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        return imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_WEBP || imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_AVIF;
    }

    public final jod A(float[] fArr) {
        int iU;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = (float[]) this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            if (iBinarySearch >= 0) {
                iU = ((int[]) this.b)[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iU = ((int[]) this.b)[0];
                } else {
                    int[] iArr2 = (int[]) this.b;
                    int length = iArr2.length - 1;
                    if (i2 == length) {
                        iU = iArr2[length];
                    } else {
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        iU = AmbientMode.AmbientCallback.u((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = iU;
        }
        return new jod(fArr, iArr);
    }

    public final tcd a(pjr pjrVar) {
        return b(pjrVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pjp] */
    public final tcd b(pjr pjrVar) {
        return ske.o(((fee) this.b).c(this.a.a(pjrVar)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, loz] */
    public final void c() {
        ((DynamicDepthResult) this.a).close();
        ?? r1 = this.b;
        if (r1 != 0) {
            r1.close();
        }
    }

    public final void d(Intent intent) {
        try {
            ((Context) this.a).startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            rge.a.c(this, "Could not find application for intent fulfillment.", new Object[0]);
            ((iso) this.b).u();
        }
    }

    public final syu e(gaw gawVar) {
        boolean z = false;
        if (gawVar.O && ((hbp) this.a).a() == 2) {
            z = true;
        }
        pas pasVar = gawVar.f;
        return ((ngk) this.b).g(ngp.b(gawVar.B, pasVar, pae.i(pasVar), z ? rwc.j(35) : rvk.a), Integer.valueOf(((pkb) gawVar.X.b).g()));
    }

    public final AudioDeviceInfo f() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.b).getDevices(1)) {
            if (audioDeviceInfo.getType() == 7) {
                h(audioDeviceInfo);
                return audioDeviceInfo;
            }
            gzi gziVar = gym.a;
        }
        return null;
    }

    public final AudioDeviceInfo g() {
        AudioDeviceInfo audioDeviceInfo = null;
        AudioDeviceInfo audioDeviceInfo2 = null;
        for (AudioDeviceInfo audioDeviceInfo3 : ((AudioManager) this.b).getDevices(1)) {
            if (audioDeviceInfo3.getType() == 11 || audioDeviceInfo3.getType() == 22) {
                h(audioDeviceInfo3);
                if (audioDeviceInfo == null) {
                    audioDeviceInfo = audioDeviceInfo3;
                }
            }
            if (audioDeviceInfo3.getType() == 3) {
                h(audioDeviceInfo3);
                if (audioDeviceInfo2 == null) {
                    audioDeviceInfo2 = audioDeviceInfo3;
                }
            }
        }
        return audioDeviceInfo != null ? audioDeviceInfo : audioDeviceInfo2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, uem] */
    public final /* synthetic */ fex j(fei feiVar) {
        imi imiVar = (imi) this.b.a();
        imiVar.getClass();
        return new fej(imiVar, ((imm) this.a).b(), feiVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List k(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<hbp> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (hbp hbpVar : list) {
                    if (hbpVar.f(cls, cls2)) {
                        arrayList.add(hbpVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List l(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<hbp> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (hbp hbpVar : list) {
                    if (hbpVar.f(cls, cls2)) {
                        Object obj = hbpVar.a;
                        if (!arrayList.contains(obj)) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void m(String str, eqo eqoVar, Class cls, Class cls2) {
        B(str).add(new hbp(cls, cls2, eqoVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized void n(List list) {
        ?? r1 = this.a;
        ArrayList arrayList = new ArrayList((Collection) r1);
        r1.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r1.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                r1.add(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ete, java.lang.Object] */
    public final void o(Bitmap bitmap) {
        this.b.d(bitmap);
    }

    public final void p(byte[] bArr) {
        ((etl) this.a).c(bArr);
    }

    public final byte[] q(int i) {
        return (byte[]) ((etl) this.a).a(i, byte[].class);
    }

    public final synchronized List t(Class cls) {
        return ((evl) this.b).c(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final synchronized List u(Class cls) {
        ?? r0 = ((ejt) this.a).a;
        ejt ejtVar = (ejt) r0.get(cls);
        ?? r1 = ejtVar == null ? 0 : ejtVar.a;
        if (r1 != 0) {
            return r1;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((evl) this.b).b(cls));
        if (((ejt) r0.put(cls, new ejt(listUnmodifiableList, (byte[]) null))) == null) {
            return listUnmodifiableList;
        }
        throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    public final synchronized void v(Class cls, Class cls2, evh evhVar) {
        ((evl) this.b).d(cls, cls2, evhVar);
        ((ejt) this.a).a.clear();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cnj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cnj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [cnj, java.lang.Object] */
    public final String w(eqi eqiVar) {
        String str;
        Object obj = this.b;
        synchronized (obj) {
            str = (String) ((fat) obj).g(eqiVar);
        }
        if (str == null) {
            eua euaVar = (eua) this.a.a();
            eoz.k(euaVar);
            try {
                MessageDigest messageDigest = euaVar.a;
                eqiVar.a(messageDigest);
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = fax.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i + i;
                        char[] cArr2 = fax.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.a.b(euaVar);
            }
        }
        Object obj2 = this.b;
        synchronized (obj2) {
            ((fat) obj2).h(eqiVar, str);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final Map y(boolean z) {
        return z ? this.a : this.b;
    }

    public final void z(eqi eqiVar, eso esoVar) {
        Map mapY = y(esoVar.e);
        if (esoVar.equals(mapY.get(eqiVar))) {
            mapY.remove(eqiVar);
        }
    }

    public jod(DynamicDepthResult dynamicDepthResult, loz lozVar) {
        this.a = dynamicDepthResult;
        this.b = lozVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Queue] */
    public final void x(String str) {
        odb odbVar;
        synchronized (this) {
            ?? r2 = this.a;
            odbVar = (odb) r2.get(str);
            eoz.k(odbVar);
            int i = odbVar.a;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i);
            }
            int i2 = i - 1;
            odbVar.a = i2;
            if (i2 == 0) {
                odb odbVar2 = (odb) r2.remove(str);
                if (!odbVar2.equals(odbVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + odbVar.toString() + ", but actually removed: " + String.valueOf(odbVar2) + YyLACfm.HdtLUfieRbCHX + str);
                }
                ?? r6 = ((ejt) this.b).a;
                synchronized (r6) {
                    if (r6.size() < 10) {
                        r6.offer(odbVar2);
                    }
                }
            }
        }
        odbVar.b.unlock();
    }

    public jod(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public jod(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public jod(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public jod(Tuning tuning, poe poeVar, pjr pjrVar) {
        this.a = tuning;
        poe poeVar2 = (poe) Map.EL.getOrDefault(poeVar.h(), pjrVar.a, poeVar);
        Face[] faceArr = (Face[]) poeVar2.a(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) poeVar2.a(CaptureResult.SCALER_CROP_REGION);
        Long l = (Long) poeVar2.a(CaptureResult.SENSOR_FRAME_DURATION);
        if (faceArr == null) {
            throw new IllegalStateException("STATISTICS_FACES not present in metadata.");
        }
        if (rect != null) {
            this.b = new qrx(faceArr, new ArrayList(), rect, l != null ? l.longValue() : 0L);
            return;
        }
        throw new IllegalStateException("SCALER_CROP_REGION not present in metadata.");
    }

    public jod(String str, String str2, byte[] bArr) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public jod(byte[] bArr) {
        this.b = new AtomicReference();
        this.a = new yd();
    }

    public jod(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new HashMap();
        this.a = new HashMap();
    }

    public jod() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    public jod(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
        this.b = new ejt((byte[]) null);
    }

    public jod(uem uemVar, uem uemVar2) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
    }

    public jod(char[] cArr) {
        this.b = new fat(1000L);
        this.a = fbe.a(10, new etz(0));
    }

    public jod(cnj cnjVar) {
        evl evlVar = new evl(cnjVar);
        this.a = new ejt((char[]) null);
        this.b = evlVar;
    }

    public jod(hbj hbjVar, owf owfVar) {
        this.a = hbjVar;
        tpc tpcVarM = szw.a.m();
        this.b = tpcVarM;
        int i = 4;
        Optional map = ((Optional) owfVar.dL()).map(new fik(i));
        tpcVarM.getClass();
        map.ifPresent(new fio(tpcVarM, i));
    }

    public jod(izm izmVar) {
        this.a = izmVar;
        this.b = tzs.c(new lbm(izmVar.gU, 7));
    }

    public jod(ejt ejtVar, owq owqVar) {
        owqVar.getClass();
        this.b = ejtVar;
        this.a = owqVar;
    }

    public jod(jgt jgtVar, fdq fdqVar) {
        jgtVar.getClass();
        fdqVar.getClass();
        this.a = jgtVar;
        this.b = fdqVar;
    }
}
