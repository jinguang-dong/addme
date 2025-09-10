package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import com.google.android.apps.camera.smarts.SmartsChipView;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ktd implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ktd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Object, tzj] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        OptionsMenuView optionsMenuView;
        int i = 0;
        switch (this.c) {
            case 0:
                Object obj2 = this.b;
                kte kteVar = (kte) this.a;
                krj krjVar = (krj) obj2;
                if (kteVar.p(krjVar)) {
                    krjVar.m(false, krs.TIMER);
                    ((krn) kteVar.a.a()).e();
                    break;
                }
                break;
            case 1:
                ksa ksaVar = (ksa) obj;
                if (ksaVar.equals(ksa.UNKNOWN)) {
                    ((sgt) krj.a.c().M(3413)).v("Property value %s is not associated with a MenuOption.", ksaVar);
                }
                Object obj3 = this.a;
                krj krjVar2 = (krj) this.b;
                if (krjVar2.A && (optionsMenuView = krjVar2.u) != null) {
                    optionsMenuView.B((krs) obj3, ksaVar);
                }
                krjVar2.t.B((krs) obj3, ksaVar);
                break;
            case 2:
                Object obj4 = this.a;
                gzg gzgVar = gzo.bD;
                kte kteVar2 = (kte) obj4;
                hbj hbjVar = kteVar2.d;
                boolean z = (hbjVar.p(gzgVar) || hbjVar.p(hac.L)) && ((Boolean) kteVar2.b.dL()).booleanValue();
                if (z != kteVar2.c) {
                    Object obj5 = this.b;
                    kteVar2.c = z;
                    krj krjVar3 = (krj) obj5;
                    if (kteVar2.p(krjVar3)) {
                        krjVar3.m(false, krs.TIMER);
                        ((krn) kteVar2.a.a()).e();
                        break;
                    }
                }
                break;
            case 3:
                List list = (List) obj;
                Integer num = (Integer) list.get(0);
                Float f = (Float) list.get(1);
                f.floatValue();
                Optional optional = ((jvb) this.b).g;
                if (optional.isPresent()) {
                    Object obj6 = this.a;
                    ArrayList arrayList = new ArrayList();
                    Float fValueOf = Float.valueOf(0.0f);
                    arrayList.add(fValueOf);
                    arrayList.add(fValueOf);
                    arrayList.add(fValueOf);
                    arrayList.add(f);
                    arrayList.add(fValueOf);
                    arrayList.add(fValueOf);
                    ((pfu) obj6).n(scn.H(new pej((CaptureRequest.Key) optional.get(), ske.am(arrayList)), new pej(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num)));
                    break;
                }
                break;
            case 4:
                if (((ksa) obj).equals(ksa.ARK_LM)) {
                    if (!((Boolean) ((luj) this.a).b(luf.aW)).booleanValue()) {
                        ((pez) this.b).f();
                        break;
                    }
                }
                break;
            case 5:
                lxc lxcVarA = lxd.a((lyr) this.a);
                SmartsChipView smartsChipView = (SmartsChipView) this.b;
                lxcVarA.f(smartsChipView.h);
                lxcVarA.b(smartsChipView.j);
                lxcVarA.d(smartsChipView.i);
                lxcVarA.g(smartsChipView.k);
                lxcVarA.h(smartsChipView.l);
                lxcVarA.e(smartsChipView.m);
                smartsChipView.c(lxcVarA.a());
                break;
            case 6:
                if (!((ksa) obj).equals(this.b)) {
                    mcn mcnVar = (mcn) this.a;
                    if (!((Boolean) mcnVar.c.b(luf.Z)).booleanValue()) {
                        mcnVar.b.b();
                        break;
                    }
                }
                break;
            case 7:
                Object obj7 = this.b;
                mcn mcnVar2 = (mcn) this.a;
                krj krjVar4 = (krj) obj7;
                if (mcnVar2.p(krjVar4)) {
                    krjVar4.m(false, mcnVar2.a);
                    break;
                }
                break;
            case 8:
                Object obj8 = this.b;
                mcn mcnVar3 = (mcn) this.a;
                krj krjVar5 = (krj) obj8;
                if (mcnVar3.p(krjVar5)) {
                    krjVar5.m(false, mcnVar3.a);
                    break;
                }
                break;
            case 9:
                ((krj) this.b).m(false, ((mcn) this.a).a);
                break;
            case 10:
                Object obj9 = this.b;
                mcn mcnVar4 = (mcn) this.a;
                krj krjVar6 = (krj) obj9;
                if (mcnVar4.p(krjVar6)) {
                    krjVar6.m(false, mcnVar4.a);
                    break;
                }
                break;
            case 11:
                Object obj10 = this.b;
                if (this.a.test(obj10)) {
                    ((krj) obj10).m(false, krs.TAXI);
                    break;
                }
                break;
            case 12:
                ((pfu) this.a).n(jea.u(((Float) obj).floatValue(), ((kqw) ((mje) this.b).N.dL()).b));
                break;
            case 13:
                if (((ltr) obj).f != ((ltr) this.b).f) {
                    ((nas) this.a).a();
                    break;
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (!((AtomicBoolean) this.a).compareAndSet(true, false)) {
                    Object obj11 = this.b;
                    nfz nfzVar = new nfz(obj11, i);
                    ngb ngbVar = (ngb) obj11;
                    Optional.ofNullable((View) DesugarAtomicReference.updateAndGet(ngbVar.c, nfzVar)).ifPresent(new mdw(ngbVar.d, 10));
                    break;
                }
                break;
            case 15:
                if (!((Boolean) obj).booleanValue()) {
                    ?? r5 = this.a;
                    this.b.a(false);
                    ngr ngrVar = (ngr) r5.a();
                    ngrVar.a.a(true);
                    ngrVar.c = 0L;
                    ngrVar.d = 0L;
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    Object obj12 = this.b;
                    ((AtomicBoolean) this.a).set(true);
                    ((our) obj12).close();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ktd(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
