package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.util.Range;
import android.view.ViewGroup;
import com.google.android.apps.camera.optionsbar.view.OptionsEntryButtonBc25Impl;
import com.google.ar.core.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kso implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kso(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) throws Resources.NotFoundException {
        mly mlyVar;
        int i = 0;
        switch (this.b) {
            case 0:
                sgv sgvVar = ktb.a;
                ((krj) this.a).m(true, krs.RAW_OUTPUT);
                break;
            case 1:
                ((krj) this.a).m(false, krs.VIDEO_ASPECT_RATIO);
                break;
            case 2:
                sgv sgvVar2 = ktb.a;
                if (((ksa) obj).equals(ksa.PHOTO_FLASH_ON)) {
                    this.a.a("");
                    break;
                }
                break;
            case 3:
                nkw nkwVar = (nkw) obj;
                OptionsEntryButtonBc25Impl optionsEntryButtonBc25Impl = (OptionsEntryButtonBc25Impl) this.a;
                Resources resources = optionsEntryButtonBc25Impl.getResources();
                nkwVar.getClass();
                Drawable drawable = resources.getDrawable(OptionsEntryButtonBc25Impl.i(nkwVar), null);
                RotateDrawable rotateDrawable = optionsEntryButtonBc25Impl.b;
                rotateDrawable.setDrawable(drawable);
                optionsEntryButtonBc25Impl.invalidateDrawable(rotateDrawable);
                if (nkwVar != nkw.UNINITIALIZED) {
                    optionsEntryButtonBc25Impl.setContentDescription(optionsEntryButtonBc25Impl.getResources().getString(R.string.options_bottom_title, nkt.a(nkwVar).c(optionsEntryButtonBc25Impl.getResources())));
                    break;
                }
                break;
            case 4:
                OptionsEntryButtonBc25Impl optionsEntryButtonBc25Impl2 = (OptionsEntryButtonBc25Impl) this.a;
                rwc rwcVarAO = qpt.aO(optionsEntryButtonBc25Impl2.c, (mxm) obj, optionsEntryButtonBc25Impl2.g);
                if (rwcVarAO.h()) {
                    ((ValueAnimator) rwcVarAO.c()).start();
                }
                optionsEntryButtonBc25Impl2.g = false;
                break;
            case 5:
                lax laxVar = (lax) obj;
                ((pfu) this.a).n(scn.H(new pej(nvm.a, Integer.valueOf(laxVar.a)), new pej(nvm.b, ske.am(laxVar.b))));
                break;
            case 6:
                ((ovx) this.a).a(((ltq) obj) == ltq.ON ? lnm.CONTINUOUS_PICTURE : lnm.OFF);
                break;
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue) {
                    ((kvo) obj2).c();
                    break;
                } else {
                    ((kvo) obj2).a.b();
                    break;
                }
            case 8:
                mmf mmfVar = (mmf) obj;
                if (mmfVar.c() && (mlyVar = mmfVar.b) != mly.UNKNOWN && mmfVar.a != mmi.OFF) {
                    kvv kvvVar = (kvv) this.a;
                    if (!kvvVar.f() && !((Boolean) ((ovx) kvvVar.t.a).d).booleanValue()) {
                        kvvVar.e(kvvVar.b(mmfVar), !((Boolean) ((ovx) kvvVar.s.d).d).booleanValue(), mlyVar != mly.GYRO, false);
                        break;
                    }
                }
                break;
            case 9:
                boolean z = ((nkw) obj) != nkw.SERENGETI;
                lit litVar = (lit) this.a;
                litVar.o.h(Boolean.valueOf(z));
                if (!z) {
                    litVar.p.h(false);
                    litVar.g.d(false);
                    break;
                }
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                ljd ljdVar = (ljd) this.a;
                ljdVar.h = iIntValue;
                ljb ljbVar = (ljb) ljdVar.b.get();
                if (ljbVar != null) {
                    ljbVar.d = iIntValue;
                    break;
                }
                break;
            case 11:
                nmr nmrVar = (nmr) obj;
                lit litVar2 = (lit) this.a;
                if (litVar2.t && ((jjp) litVar2.h.dL()).a().a.isPresent() && litVar2.l.dL() == lkk.AUTO && lit.e.contains(nmrVar) && (!litVar2.u || nmrVar == nmr.WIDEST)) {
                    litVar2.e();
                }
                litVar2.t = true;
                litVar2.u = false;
                break;
            case 12:
                lit litVar3 = (lit) this.a;
                if (litVar3.s) {
                    litVar3.e();
                }
                litVar3.s = true;
                break;
            case 13:
                ljq ljqVar = (ljq) obj;
                double d = ljqVar.a;
                Object obj3 = this.a;
                ljj ljjVar = (ljj) obj3;
                lky lkyVar = ljjVar.h;
                lkyVar.b(d);
                nhz nhzVar = ((jjx) obj3).a;
                nhzVar.getClass();
                int iK = ljjVar.k(nhzVar.a());
                int i2 = ljqVar.b;
                if (!ljjVar.l || iK >= i2) {
                    ljjVar.f.a(false);
                } else {
                    ljjVar.d.c(i2);
                    ljjVar.f.a(true);
                }
                if (ljqVar.c && ((jjp) ljjVar.e.dL()).a().f.isEmpty()) {
                    nhzVar.g(ljjVar.i((int) Math.round(lkyVar.a())), false, niz.a);
                    break;
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ljj) this.a).g.h(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                break;
            case 15:
                Object obj4 = this.a;
                ljj ljjVar2 = (ljj) obj4;
                lkw lkwVarA = ljo.a(((Integer) ((Range) ((ovx) ljjVar2.d.a()).d).getLower()).intValue());
                ljjVar2.o.f(ljjVar2.l(lkwVarA.a));
                ljjVar2.r = lkwVarA.b;
                ((jjp) ljjVar2.e.dL()).a().f.ifPresent(new lji(obj4, i));
                break;
            case 16:
                ((lka) this.a).j();
                break;
            case 17:
                ((lka) this.a).j();
                break;
            case 18:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                lka lkaVar = (lka) this.a;
                ViewGroup viewGroup = lkaVar.g;
                if (viewGroup != null) {
                    boolean z2 = !zBooleanValue2;
                    viewGroup.findViewById(R.id.lens_toggle_ultrawide_text).setEnabled(z2);
                    lkaVar.g.findViewById(R.id.lens_toggle_wide_text).setEnabled(z2);
                    lkaVar.g.findViewById(R.id.lens_toggle_tele_text).setEnabled(z2);
                    break;
                }
                break;
            case 19:
                lku lkuVar = (lku) obj;
                double d2 = lkuVar.a;
                Object obj5 = this.a;
                lkn lknVar = (lkn) obj5;
                lky lkyVar2 = lknVar.g;
                lkyVar2.b(d2);
                if (!lknVar.l && ((jjp) lknVar.e.dL()).a().g.isEmpty() && lkuVar.b) {
                    nhz nhzVar2 = ((jjx) obj5).a;
                    nhzVar2.getClass();
                    nhzVar2.g(lknVar.i(Math.round(lkyVar2.a())), false, niz.a);
                    break;
                }
                break;
            default:
                ((lkn) this.a).f.h(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                break;
        }
    }
}
