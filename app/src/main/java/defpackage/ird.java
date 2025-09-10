package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ird implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ird(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r14v33, types: [java.lang.Object, jgs] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        Optional optionalOf;
        String string = null;
        switch (this.b) {
            case 0:
                iqq iqqVar = (iqq) obj;
                irk irkVar = (irk) this.a;
                if (irkVar.n(iqqVar)) {
                    irkVar.e.add(iqqVar);
                    return;
                }
                return;
            case 1:
                iqq iqqVar2 = (iqq) obj;
                irk irkVar2 = (irk) this.a;
                if (irkVar2.n(iqqVar2)) {
                    irkVar2.e.add(iqqVar2);
                    return;
                }
                return;
            case 2:
                iqy iqyVar = (iqy) obj;
                irk irkVar3 = (irk) this.a;
                float f = true != irkVar3.m ? 1.0f : 0.0f;
                Optional optional = iqyVar.c;
                if (optional.isPresent()) {
                    irkVar3.r.i(((Integer) optional.get()).intValue(), f);
                    return;
                }
                Optional optional2 = iqyVar.d;
                if (optional2.isPresent()) {
                    irkVar3.r.m(new ggg(optional2.get(), (byte[]) null), f, false);
                    return;
                }
                return;
            case 3:
                ((irj) obj).b((iqq) this.a);
                return;
            case 4:
                Object obj2 = ((AmbientModeSupport.AmbientController) obj).a;
                iqz iqzVar = ((irs) this.a).v;
                iry iryVar = (iry) obj2;
                iryVar.q = iqzVar;
                iryVar.b(iqzVar, false);
                return;
            case 5:
                iou iouVar = (iou) obj;
                switch (((iqq) this.a).ordinal()) {
                    case 1:
                        optionalOf = Optional.of(sqg.IDLE);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        optionalOf = Optional.of(sqg.HINT);
                        break;
                    case 5:
                    case 6:
                    case 7:
                        optionalOf = Optional.of(sqg.SURPRISE);
                        break;
                    default:
                        optionalOf = Optional.empty();
                        break;
                }
                iouVar.getClass();
                optionalOf.ifPresent(new ird(iouVar, 6));
                return;
            case 6:
                sqg sqgVar = (sqg) obj;
                iou iouVar2 = (iou) this.a;
                iouVar2.b(iouVar2.b, iouVar2.f, sqgVar);
                iouVar2.c = sqgVar;
                return;
            case 7:
                jhh jhhVar = (jhh) obj;
                int i = jgt.f;
                if (jhhVar instanceof jft) {
                    ((jft) jhhVar).j((Configuration) this.a);
                    return;
                }
                return;
            case 8:
                jhh jhhVar2 = (jhh) obj;
                int i2 = jgt.f;
                if (jhhVar2 instanceof jfv) {
                    ((jfv) jhhVar2).m((Intent) this.a);
                    return;
                }
                return;
            case 9:
                this.a.a((jhh) obj);
                return;
            case 10:
                jjv jjvVar = (jjv) obj;
                if (((jjn) this.a).e.dL() != lkk.AUTO) {
                    jjn.B(jjvVar, false);
                    return;
                }
                return;
            case 11:
                nhz nhzVar = ((jjx) this.a).a;
                nhzVar.getClass();
                nhzVar.g(((Float) obj).floatValue(), false, niz.a);
                return;
            case 12:
                jju jjuVar = (jju) obj;
                jkx jkxVar = (jkx) this.a;
                if (Collection.EL.stream(jkxVar.p()).anyMatch(new hzk(12))) {
                    jkxVar.l.e(jjuVar.c(), false, false);
                    return;
                } else {
                    jkxVar.l.e(jjuVar.c(), false, true);
                    return;
                }
            case 13:
                Iterator it = ((pud) obj).f.iterator();
                while (it.hasNext()) {
                    ((AtomicInteger) this.a).addAndGet((int) ((puc) it.next()).e);
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((kgl) this.a).b.e(pjr.b((String) obj));
                return;
            case 15:
                ((krj) this.a).t.A((krs) obj);
                return;
            case 16:
                krz krzVar = (krz) obj;
                owq owqVarJ = krzVar.j();
                Object obj3 = this.a;
                krj krjVar = (krj) obj3;
                Context context = krjVar.b;
                krq krqVarCg = qpt.cg(krzVar, context.getResources());
                ksa ksaVar = (ksa) owqVarJ.dL();
                if (ksaVar == ksa.UNKNOWN) {
                    ((sgt) krj.a.c().M(3406)).v("Property value %s is not associated with a MenuOption.", owqVarJ.dL());
                }
                Stream map = Collection.EL.stream(krzVar.l()).map(new fmu(obj3, krzVar, 4));
                int i3 = sbp.d;
                sbp sbpVar = (sbp) map.collect(ryv.a);
                boolean zO = krzVar.o(krjVar);
                rbb rbbVarK = krzVar.k();
                ksd ksdVarD = rbbVarK != null ? krzVar.D(context, rbbVarK) : krzVar.i();
                OptionsMenuView optionsMenuViewA = krjVar.a(krzVar);
                int iA = krzVar.A();
                int iEI = zO ? 0 : krzVar.eI();
                krzVar.C();
                synchronized (optionsMenuViewA) {
                    Context context2 = optionsMenuViewA.getContext();
                    ksc kscVar = optionsMenuViewA.k;
                    kscVar.getClass();
                    kto ktoVar = new kto(context2, krqVarCg, ksaVar, kscVar, ksdVarD, krzVar, iA, false, optionsMenuViewA.m);
                    ktoVar.setId(View.generateViewId());
                    if (iEI != 0) {
                        string = optionsMenuViewA.getResources().getString(iEI);
                    }
                    ktoVar.k();
                    if (zO) {
                        for (int i4 = 0; i4 < sbpVar.size(); i4++) {
                            if (!((Boolean) sbpVar.get(i4)).booleanValue()) {
                                ktoVar.i(((krr) ktoVar.k.d.get(i4)).a);
                            }
                        }
                    } else {
                        ktoVar.h(string);
                        ktoVar.setEnabled(false);
                    }
                    for (int i5 = 0; i5 < optionsMenuViewA.x(); i5++) {
                        LinearLayout linearLayout = optionsMenuViewA.l;
                        linearLayout.getClass();
                        View childAt = linearLayout.getChildAt(i5);
                        if ((childAt instanceof kto) && iA < ((kto) childAt).m) {
                            LinearLayout linearLayout2 = optionsMenuViewA.l;
                            linearLayout2.getClass();
                            linearLayout2.addView(ktoVar, i5);
                            optionsMenuViewA.h.add(ktoVar);
                        }
                    }
                    LinearLayout linearLayout22 = optionsMenuViewA.l;
                    linearLayout22.getClass();
                    linearLayout22.addView(ktoVar, i5);
                    optionsMenuViewA.h.add(ktoVar);
                }
                return;
            case 17:
                ((krz) obj).ec((krj) this.a);
                return;
            case 18:
                ((kto) obj).l((ksa) this.a);
                return;
            case 19:
                kto ktoVar2 = (kto) obj;
                Map map2 = ktoVar2.j;
                Object obj4 = this.a;
                ImageButton imageButton = (ImageButton) map2.get(obj4);
                if (imageButton == null) {
                    ((sgt) kto.i.c().M(3441)).E(CZAHo.NRxDTtgyxs, obj4, ktoVar2.g());
                    return;
                } else {
                    if (imageButton != ((ImageButton) map2.get(ktoVar2.p))) {
                        imageButton.setEnabled(true);
                        imageButton.setImageAlpha(255);
                        return;
                    }
                    return;
                }
            default:
                ((pdm) obj).d((phc) this.a);
                return;
        }
    }
}
