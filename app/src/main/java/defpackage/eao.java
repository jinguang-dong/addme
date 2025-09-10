package defpackage;

import android.graphics.RectF;
import android.os.StrictMode;
import android.util.Log;
import androidx.wear.ambient.AmbientLifecycleObserver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class eao implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public eao(eud eudVar, Runnable runnable, int i) {
        this.c = i;
        this.a = runnable;
        this.b = eudVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, poe] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, pdk] */
    /* JADX WARN: Type inference failed for: r11v39, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v4, types: [dzs, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        HashSet hashSet;
        peo peoVar;
        Float[] fArr;
        Object obj = null;
        rectF = null;
        rectF = null;
        rectF = null;
        RectF rectF = null;
        switch (this.c) {
            case 0:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((oge) it.next()).e(((eap) this.b).d);
                }
                return;
            case 1:
                ((dyy) this.a).a.c((ejs) this.b, 3);
                return;
            case 2:
                dxj dxjVar = ((eax) this.b).b.f;
                Object obj2 = dxjVar.f;
                Object obj3 = this.a;
                synchronized (obj2) {
                    nhz nhzVarE = dxjVar.e((String) obj3);
                    if (nhzVarE != null) {
                        obj = nhzVarE.f;
                    }
                }
                if (obj == null || !((ebx) obj).b()) {
                    return;
                }
                ?? r11 = this.b;
                synchronized (((eax) r11).c) {
                    ((eax) r11).f.put(AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A((ebx) obj), obj);
                    ((eax) r11).g.put(AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A((ebx) obj), dzx.a(((eax) r11).i, (ebx) obj, (una) ((eax) r11).j.d, r11));
                }
                return;
            case 3:
                String string = ((UUID) this.a).toString();
                string.getClass();
                AmbientLifecycleObserver.AmbientLifecycleCallback.CC.m((dyj) this.b, string);
                return;
            case 4:
                ((emc) this.b).b.a((byte[]) this.a);
                return;
            case 5:
                emd emdVar = ((elu) this.b).c;
                emdVar.c.e(-16);
                emdVar.b.obtainMessage(601, this.a).sendToTarget();
                return;
            case 6:
                emm emmVar = (emm) this.a;
                if (emmVar.g().d()) {
                    return;
                }
                emr emrVar = emmVar.a;
                emrVar.e.e(2);
                emrVar.d.obtainMessage(301, this.b).sendToTarget();
                return;
            case 7:
                ((emk) this.b).b.a((byte[]) this.a);
                return;
            case 8:
                jeg jegVar = (jeg) ((emp) this.b).a.a;
                if (jegVar.r) {
                    return;
                }
                jegVar.b.c();
                if (jegVar.s) {
                    Object obj4 = this.a;
                    jej jejVar = jegVar.b;
                    byte[] bArr = (byte[]) obj4;
                    jejVar.C = bArr;
                    jejVar.z = true;
                    jdn jdnVar = jegVar.c;
                    if (jdnVar.c) {
                        jdnVar.b.i(bArr);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ene eneVar = (ene) this.a;
                eneVar.a().obtainMessage(2).sendToTarget();
                eneVar.a().post(((end) this.b).a);
                return;
            case 10:
                ((emx) this.b).b.b((ena) this.a);
                return;
            case 11:
                ((ena) this.b).c().obtainMessage(105, this.a).sendToTarget();
                return;
            case 12:
                ((ena) this.a).c().obtainMessage(101, this.b).sendToTarget();
                return;
            case 13:
                ena enaVar = (ena) this.b;
                enaVar.c().obtainMessage(101, null).sendToTarget();
                enaVar.c().post(((end) this.a).a);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ena) this.b).c().obtainMessage(103, this.a).sendToTarget();
                return;
            case 15:
                ((enr) this.b).a.c((RuntimeException) this.a);
                return;
            case 16:
                if (((eud) this.b).a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.a.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 17:
                ?? r0 = this.a;
                Object obj5 = this.b;
                fbz fbzVar = ((fbx) obj5).b;
                fbzVar.a(r0);
                if (fbzVar.c()) {
                    synchronized (obj5) {
                        hashSet = new HashSet(((fbx) obj5).a);
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                    return;
                }
                return;
            case 18:
                ((fdu) this.b).a.requestPermissions((String[]) ((ArrayList) this.a).toArray(new String[0]), 151398431);
                return;
            case 19:
                ((ffk) this.b).g = true;
                ffm ffmVar = (ffm) this.a;
                ffmVar.b.a(true);
                ffmVar.a.a(15);
                return;
            default:
                ?? r02 = this.a;
                Object obj6 = this.b;
                try {
                    lau lauVarA = ((fgk) obj6).c.a(r02);
                    Set setD = lauVarA.a.c().d();
                    peo peoVar2 = lauVarA.c;
                    if (setD.contains(peoVar2)) {
                        peoVar = peoVar2;
                    } else {
                        peoVar = lauVarA.d;
                        if (!setD.contains(peoVar)) {
                            peoVar = null;
                        }
                    }
                    boolean zEquals = peoVar != null ? ((fgk) obj6).e.equals(peoVar.d().a) : false;
                    poj pojVarE = lauVarA.e(peoVar2);
                    if (pojVarE == null) {
                        pojVarE = lauVarA.e(lauVarA.d);
                    }
                    try {
                        if (pojVarE != null) {
                            try {
                                poe poeVarD = r02.d();
                                if (poeVarD != null && (fArr = (Float[]) poeVarD.a(kgx.f)) != null && fArr.length >= 4) {
                                    float fFloatValue = fArr[0].floatValue();
                                    float fFloatValue2 = fArr[1].floatValue();
                                    float fFloatValue3 = fArr[2].floatValue();
                                    float fFloatValue4 = fArr[3].floatValue();
                                    float f = fFloatValue - (fFloatValue3 * 0.5f);
                                    float f2 = fFloatValue2 - (0.5f * fFloatValue4);
                                    rectF = new RectF(f, f2, fFloatValue3 + f, fFloatValue4 + f2);
                                }
                            } catch (IllegalArgumentException e) {
                                ((sgt) ((sgt) fgk.a.c().h(shx.a, "BobaBufferListener")).M(95)).v("Error retrieving track region: %s.", e.getMessage());
                            }
                            ((fgk) obj6).b.j(pojVarE, rectF, zEquals);
                        } else {
                            ((sgt) ((sgt) fgk.a.c().h(shx.a, "BobaBufferListener")).M(94)).E("Missing image for frame %s from camera %s.", r02.b(), peoVar != null ? peoVar.d() : "");
                        }
                        if (pojVarE != null) {
                            pojVarE.close();
                        }
                        return;
                    } finally {
                    }
                } finally {
                    r02.close();
                }
        }
    }

    public /* synthetic */ eao(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public eao(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ eao(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public eao(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
