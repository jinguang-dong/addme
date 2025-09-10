package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.hardware.Camera;
import android.hardware.camera2.CaptureResult;
import android.media.Image;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.ar.core.Frame;
import com.google.ar.core.R;
import com.google.ar.core.Session;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.creativecamera.allin.jni.AllInNativeImpl;
import j$.time.Duration;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public as(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.d = i;
        this.b = intent;
        this.a = context;
        this.c = pendingResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v41, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v46, types: [enb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v47, types: [java.lang.Object, pdk] */
    /* JADX WARN: Type inference failed for: r15v51, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v52, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, pdk] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        poj pojVarE;
        View view;
        Optional optionalOf;
        fipVar = null;
        fip fipVar = null;
        boolean zBooleanValue = true;
        switch (this.d) {
            case 0:
                aw awVar = (aw) this.c;
                cr.a(((dg) this.a).a, ((dg) this.b).a, awVar.f, awVar.e, false);
                return;
            case 1:
                int i = am.e;
                ((ViewGroup) this.b).endViewTransition((View) this.a);
                Object obj = this.c;
                ((an) obj).a.a.f((de) obj);
                return;
            case 2:
                boolean z = ((AtomicBoolean) this.a).get();
                ?? r1 = this.b;
                Object obj2 = this.c;
                if (z) {
                    return;
                }
                try {
                    ((civ) obj2).c(r1.a());
                    return;
                } catch (Throwable th) {
                    ((civ) obj2).d(th);
                    return;
                }
            case 3:
                Object obj3 = this.a;
                ?? r12 = this.b;
                Object obj4 = this.c;
                try {
                    zBooleanValue = ((Boolean) r12.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (((dxj) obj4).f) {
                    ebm ebmVarA = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A((ebx) ((nhz) obj3).f);
                    String str = ebmVarA.a;
                    if (((dxj) obj4).e(str) == obj3) {
                        ((dxj) obj4).d(str);
                    }
                    dwj.b();
                    obj4.getClass().getSimpleName();
                    Iterator it = ((dxj) obj4).e.iterator();
                    while (it.hasNext()) {
                        ((dwy) it.next()).a(ebmVarA, zBooleanValue);
                    }
                }
                return;
            case 4:
                ((dxj) ((ebn) this.b).a).g((ejs) this.a);
                return;
            case 5:
                try {
                    Object obj5 = this.b;
                    boolean booleanExtra = ((Intent) obj5).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj5).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj5).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj5).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    dwj.b();
                    int i2 = ConstraintProxyUpdateReceiver.a;
                    Object obj6 = this.a;
                    ecz.a((Context) obj6, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    ecz.a((Context) obj6, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    ecz.a((Context) obj6, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    ecz.a((Context) obj6, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) this.c).finish();
                }
            case 6:
                eby ebyVarB = ((WorkDatabase) this.c).B();
                Object obj7 = this.b;
                dcu dcuVarA = dcu.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                dcuVarA.g(1, (String) obj7);
                dco dcoVar = ((ecr) ebyVarB).a;
                dcoVar.k();
                Cursor cursorF = cwy.f(dcoVar, dcuVarA);
                try {
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(cursorF.getString(0));
                    }
                    cursorF.close();
                    dcuVarA.j();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AmbientLifecycleObserver.AmbientLifecycleCallback.CC.m((dyj) this.a, (String) it2.next());
                    }
                    return;
                } catch (Throwable th2) {
                    cursorF.close();
                    dcuVarA.j();
                    throw th2;
                }
            case 7:
                jeh jehVar = new jeh(this, 1);
                emd emdVar = ((elu) this.a).c;
                emdVar.c.e(48);
                emdVar.b.obtainMessage(301, jehVar).sendToTarget();
                return;
            case 8:
                Object obj8 = this.b;
                emn emnVar = ((emm) this.c).a.d;
                emnVar.obtainMessage(202, obj8).sendToTarget();
                emnVar.post(((end) this.a).a);
                return;
            case 9:
                ((emm) this.a).a.d.obtainMessage(107, emp.a((Handler) this.c, (AmbientMode.AmbientController) this.b)).sendToTarget();
                return;
            case 10:
                ((emm) this.a).a.d.obtainMessage(104, emp.a((Handler) this.c, (AmbientMode.AmbientController) this.b)).sendToTarget();
                return;
            case 11:
                ((emx) this.c).b.e((ene) this.a, (String) this.b);
                return;
            case 12:
                ena enaVar = (ena) this.b;
                enaVar.c().obtainMessage(3, enaVar.a(), 0, emx.f((Handler) this.c, this.a)).sendToTarget();
                return;
            case 13:
                Handler handlerC = ((ena) this.a).c();
                Object obj9 = this.c;
                handlerC.obtainMessage(102, obj9 != null ? new enc((Handler) obj9, this.b) : null).sendToTarget();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj10 = this.c;
                Object obj11 = this.b;
                ?? r15 = this.a;
                try {
                    poe poeVarD = r15.d();
                    if (poeVarD != null && (pojVarE = r15.e((peo) ((rwc) obj11).c())) != null) {
                        synchronized (obj10) {
                            Map map = ((fja) obj10).b;
                            if (!map.isEmpty() && map.containsKey(Integer.valueOf(((fja) obj10).l))) {
                                fipVar = (fip) map.get(Integer.valueOf(((fja) obj10).l));
                                fipVar.getClass();
                            }
                        }
                        if (fipVar == null) {
                            pojVarE.close();
                        } else {
                            synchronized (fipVar) {
                                if (fipVar.v || fipVar.t) {
                                    pojVarE.close();
                                } else {
                                    String strB = poeVarD.b();
                                    if (strB == null) {
                                        pojVarE.close();
                                    } else {
                                        tcd tcdVarB = fipVar.b(pjr.b(strB));
                                        fji fjiVar = fipVar.l;
                                        int i3 = fipVar.c;
                                        fjh fjhVar = new fjh(pojVarE, tcdVarB);
                                        if (((fiz) fjiVar).b.l(i3)) {
                                            fji fjiVar2 = ((fiz) fjiVar).a;
                                            if (((fje) fjiVar2).f) {
                                                fif fifVar = ((fje) fjiVar2).g;
                                                if (fifVar.e == null || (view = fifVar.a) == null || view.getVisibility() != 0) {
                                                    fjhVar.close();
                                                } else {
                                                    ViewGroup viewGroup = fifVar.e;
                                                    viewGroup.getClass();
                                                    int height = viewGroup.getHeight();
                                                    ViewGroup viewGroup2 = fifVar.e;
                                                    viewGroup2.getClass();
                                                    fjf fjfVar = fifVar.m;
                                                    int width = viewGroup2.getWidth();
                                                    if (fjfVar.a) {
                                                        poj pojVar = fjhVar.a;
                                                        List listG = pojVar.g();
                                                        if (listG.size() >= 3) {
                                                            synchronized (fjfVar) {
                                                                poi poiVar = (poi) listG.get(0);
                                                                poi poiVar2 = (poi) listG.get(1);
                                                                poi poiVar3 = (poi) listG.get(2);
                                                                ByteBuffer buffer = poiVar.getBuffer();
                                                                ByteBuffer buffer2 = poiVar2.getBuffer();
                                                                ByteBuffer buffer3 = poiVar3.getBuffer();
                                                                fjfVar.g = buffer;
                                                                fjfVar.h = buffer2;
                                                                fjfVar.i = buffer3;
                                                                fjfVar.b = width;
                                                                fjfVar.c = height;
                                                                fjfVar.d = poiVar.getRowStride();
                                                                fjfVar.e = pojVar.b();
                                                                if (!fjfVar.k) {
                                                                    fjfVar.l = fjhVar.b;
                                                                    fjfVar.k = true;
                                                                }
                                                                fjh fjhVar2 = fjfVar.f;
                                                                if (fjhVar2 != null) {
                                                                    fjhVar2.close();
                                                                }
                                                                fjfVar.f = fjhVar;
                                                            }
                                                        }
                                                    } else {
                                                        fjhVar.close();
                                                    }
                                                }
                                            } else {
                                                fjhVar.close();
                                            }
                                        } else {
                                            fjhVar.close();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                } finally {
                    r15.close();
                }
            case 15:
                Object obj12 = this.b;
                Object obj13 = this.a;
                Object obj14 = this.c;
                try {
                    rwu rwuVarAa = gsn.aa();
                    rwuVarAa.e();
                    teg tegVar = ((fip) obj14).f;
                    int i4 = ((fip) obj14).c;
                    fij fijVar = new fij(2);
                    tdx tdxVarA = tegVar.a(i4);
                    tdxVarA.g(((ShotMetadata) obj12).e());
                    tdxVarA.i();
                    tfq tfqVar = tegVar.b;
                    AllInNativeImpl.a(((AllInNativeImpl) tfqVar).processFirstFullResImageImpl(((AllInNativeImpl) tfqVar).b, i4, ((InterleavedImageU8) obj13).f().a, ShotMetadata.a((ShotMetadata) obj12), fijVar));
                    ((fip) obj14).j.d(rwuVarAa.c());
                    return;
                } catch (tew e) {
                    ((sgt) ((sgt) fip.a.b().i(e)).M(169)).t("Invalid image rotation for groupId:%s", ((fip) obj14).c);
                    return;
                }
            case 16:
                Object obj15 = this.a;
                fke fkeVar = (fke) obj15;
                if (fkeVar.g == null || fkeVar.h == null || fkeVar.i == null) {
                    View viewInflate = fkeVar.c.inflate(R.layout.error_popup, fkeVar.d, false);
                    fkeVar.g = new PopupWindow(viewInflate, -2, -2);
                    fkeVar.h = (Button) viewInflate.findViewById(R.id.try_again_button);
                    fkeVar.i = (TextView) viewInflate.findViewById(R.id.error_popup_desc);
                }
                PopupWindow popupWindow = fkeVar.g;
                popupWindow.getClass();
                if (!popupWindow.isShowing()) {
                    Object obj16 = this.b;
                    sbv sbvVar = fke.a;
                    if (sbvVar.containsKey(obj16)) {
                        Integer num = (Integer) sbvVar.get(obj16);
                        num.getClass();
                        int iIntValue = num.intValue();
                        optionalOf = ((fkf) obj16).equals(fkf.TOO_MANY_PEOPLE) ? Optional.of(fkeVar.e.getString(iIntValue, 20)) : Optional.of(fkeVar.e.getString(iIntValue));
                    } else {
                        optionalOf = Optional.empty();
                    }
                    optionalOf.ifPresent(new fio(obj15, 5));
                    TextView textView = fkeVar.i;
                    textView.getClass();
                    textView.setVisibility(true != optionalOf.isPresent() ? 8 : 0);
                    PopupWindow popupWindow2 = fkeVar.g;
                    popupWindow2.getClass();
                    popupWindow2.showAtLocation(fkeVar.d, 17, 0, 0);
                }
                ?? r152 = this.c;
                Button button = fkeVar.h;
                button.getClass();
                button.setOnClickListener(r152);
                return;
            case 17:
                fna fnaVar = (fna) this.c;
                AtomicBoolean atomicBoolean = fnaVar.d;
                ?? r2 = this.a;
                if (atomicBoolean.get()) {
                    return;
                }
                if (r2.d() == null) {
                    return;
                }
                poj pojVarE2 = r2.e(this.b);
                if (pojVarE2 == null) {
                    return;
                }
                pdo pdoVarB = r2.b();
                pdoVarB.getClass();
                long j = fnaVar.g;
                long j2 = pdoVarB.c;
                if (j > -1 && j2 - j > 1) {
                    ((sgt) fna.a.c().M(278)).A("Skipped %d frame injections (dt = %dms).", j2 - fnaVar.g, Duration.ofNanos(pojVarE2.d() - fnaVar.h).toMillis());
                }
                fnaVar.g = j2;
                fnaVar.h = pojVarE2.d();
                ezh.m(new as((Object) fnaVar.i, pojVarE2.j().a, r1.j().a, 19, (byte[]) null));
                fnaVar.e.add(pojVarE2);
                r2.close();
                fnaVar.f = true;
                return;
            case 18:
                ((Frame) ((fok) this.c).a).transformCoordinates2d(ezh.j(6), (float[]) this.a, ezh.j(4), (float[]) this.b);
                return;
            case 19:
                ((Session) ((fok) this.b).a).inject((Image) this.a, (CaptureResult) this.c);
                return;
            default:
                ((fqj) this.c).b((Thread) this.a, (Throwable) this.b);
                return;
        }
    }

    public as(elu eluVar, emu emuVar, Handler handler, int i) {
        this.d = i;
        this.a = eluVar;
        this.b = emuVar;
        this.c = handler;
    }

    public as(emm emmVar, Camera.Parameters[] parametersArr, end endVar, int i) {
        this.d = i;
        this.c = emmVar;
        this.b = parametersArr;
        this.a = endVar;
    }

    public as(emx emxVar, ene eneVar, String str, int i) {
        this.d = i;
        this.c = emxVar;
        this.a = eneVar;
        this.b = str;
    }

    public as(ena enaVar, Handler handler, emw emwVar, int i) {
        this.d = i;
        this.b = enaVar;
        this.c = handler;
        this.a = emwVar;
    }

    public as(ena enaVar, Handler handler, Object obj, int i) {
        this.d = i;
        this.a = enaVar;
        this.c = handler;
        this.b = obj;
    }

    public /* synthetic */ as(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ as(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ as(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ as(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ as(AtomicBoolean atomicBoolean, civ civVar, uif uifVar, int i) {
        this.d = i;
        this.a = atomicBoolean;
        this.c = civVar;
        this.b = uifVar;
    }
}
