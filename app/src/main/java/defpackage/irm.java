package defpackage;

import android.content.Context;
import android.location.Location;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.camera.jupiter.uranus.UranusCharacterItem;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class irm implements rvu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ irm(irs irsVar, iqz iqzVar, isg isgVar, int i) {
        this.d = i;
        this.a = irsVar;
        this.b = iqzVar;
        this.c = isgVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.Object, qbq] */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        String string;
        ExifInterface exifInterface;
        pcz pczVarK;
        int iU;
        int i = 0;
        switch (this.d) {
            case 0:
                Optional optional = (Optional) obj;
                Object obj2 = this.b;
                iqz iqzVar = (iqz) obj2;
                int iOrdinal = iqzVar.ordinal();
                Object obj3 = this.a;
                irs irsVar = (irs) obj3;
                ira iraVar = irsVar.i;
                if (iOrdinal == 0) {
                    string = iraVar.c.getString(R.string.uranus_character_chicken_accessibility);
                } else if (iOrdinal == 1) {
                    string = iraVar.c.getString(R.string.uranus_character_fish_accessibility);
                } else if (iOrdinal == 2) {
                    string = iraVar.c.getString(R.string.uranus_character_block_accessibility);
                } else if (iOrdinal == 3) {
                    string = iraVar.c.getString(R.string.uranus_character_geo_accessibility);
                } else {
                    if (iOrdinal != 4) {
                        throw new RuntimeException(null, null);
                    }
                    string = iraVar.c.getString(R.string.uranus_character_joy_accessibility);
                }
                Context context = irsVar.g;
                int i2 = UranusCharacterItem.k;
                UranusCharacterItem uranusCharacterItem = (UranusCharacterItem) View.inflate(context, R.layout.uranus_character_item, null);
                uranusCharacterItem.g = iqzVar;
                uranusCharacterItem.h = string;
                LinearLayout linearLayout = irsVar.p;
                sbp sbpVar = irsVar.a;
                int iIndexOf = sbpVar.indexOf(obj2);
                int childCount = irsVar.p.getChildCount();
                for (int childCount2 = irsVar.p.getChildCount() - 1; childCount2 >= 0; childCount2--) {
                    if (iIndexOf < sbpVar.indexOf(((UranusCharacterItem) irsVar.p.getChildAt(childCount2)).g)) {
                        childCount = childCount2;
                    }
                }
                linearLayout.addView(uranusCharacterItem, childCount);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iqzVar.equals(irsVar.v) ? irsVar.c(R.dimen.character_selected_item_width_with_expand) : irsVar.c(R.dimen.character_unselected_item_width), -1);
                layoutParams.weight = 1.0f;
                layoutParams.leftMargin = irsVar.c(R.dimen.character_item_margin_horizontal);
                layoutParams.rightMargin = irsVar.c(R.dimen.character_item_margin_horizontal);
                uranusCharacterItem.setLayoutParams(layoutParams);
                optional.getClass();
                uranusCharacterItem.d(optional);
                int i3 = true == optional.isPresent() ? 3 : 1;
                Object obj4 = this.c;
                uranusCharacterItem.f(i3);
                uranusCharacterItem.e(iqzVar.equals(irsVar.v));
                uranusCharacterItem.setOnClickListener(new ipd(obj3, obj4, 3));
                uranusCharacterItem.setAccessibilityDelegate(new irr(irsVar));
                return null;
            case 1:
                String str = (String) obj;
                str.getClass();
                lcy lcyVar = (lcy) ((sbv) this.c).get(str);
                return (lcyVar == null || !(lcyVar == lcy.ULTRAWIDE || lcyVar == lcy.TELE)) ? this.a : this.b;
            case 2:
                Integer num = (Integer) obj;
                while (true) {
                    ?? r0 = this.c;
                    if (i >= r0.size()) {
                        Object obj5 = this.a;
                        Object obj6 = this.b;
                        lmf lmfVarA = lmg.a((kiy) r0.get(num.intValue()));
                        kjn kjnVar = (kjn) obj6;
                        pao paoVar = kjnVar.c;
                        paoVar.getClass();
                        lmfVarA.c = paoVar;
                        lmfVarA.g = (ltr) obj5;
                        lmfVarA.a = kjnVar.b.c;
                        return lmfVarA.a();
                    }
                    if (i != num.intValue()) {
                        ((kiy) r0.get(i)).close();
                    }
                    i++;
                }
            case 3:
                ExifInterface exifInterface2 = (ExifInterface) obj;
                mfo mfoVar = (mfo) this.c;
                boolean zEquals = mfoVar.a.equals(ppo.c);
                Object obj7 = this.a;
                if (zEquals) {
                    pdb pdbVar = new pdb(exifInterface2);
                    lrl lrlVar = (lrl) obj7;
                    pdbVar.g(lrlVar.u);
                    if (mfoVar.d && (pczVarK = (exifInterface = pdbVar.a).k(ExifInterface.Y)) != null) {
                        int[] iArrM = pczVarK.m();
                        if (iArrM != null && iArrM.length > 0) {
                            i = iArrM[0];
                        }
                        pczVarK.g(i | 1);
                        exifInterface.y(pczVarK);
                    }
                    if (mfoVar.c.h()) {
                        pdbVar.d((Location) mfoVar.c.c());
                    }
                    if (mfoVar.e == kpa.c) {
                        pdbVar.a.p(ExifInterface.TAG_SOFTWARE);
                    }
                    Object obj8 = this.b;
                    if (obj8 != null) {
                        if (lrlVar.z.o(gzo.bB)) {
                            lpd lpdVar = (lpd) obj8;
                            if (lpdVar.d() && lpdVar.d == 0.0f) {
                                ((sgt) lrl.a.c().M(4338)).v("Invalid remote data. Depth: %s.", Float.valueOf(lpdVar.d));
                                lrlVar.B.l("Invalid depth data, please take a bugreport!");
                            }
                        }
                        lpd lpdVar2 = (lpd) obj8;
                        if (lpdVar2.d()) {
                            pdbVar.c(ExifInterface.aQ, pdb.i(Float.valueOf(lpdVar2.d), 10L));
                        }
                        if (System.currentTimeMillis() <= lpdVar2.g + 5000) {
                            pdbVar.c(ExifInterface.aP, pdb.i(Float.valueOf(lpdVar2.f), 10L));
                        }
                    }
                    exifInterface2 = pdbVar.a;
                }
                lrl lrlVar2 = (lrl) obj7;
                lrlVar2.A.q(exifInterface2);
                ((mdo) lrlVar2.i).l = exifInterface2;
                mfoVar.a(exifInterface2);
                return exifInterface2;
            case 4:
                Object obj9 = this.c;
                ((ltg) obj9).name();
                ((lsp) this.b).d(new glw(this.a, (lsy) obj, obj9, 8, (char[]) null));
                return null;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    ((AtomicInteger) this.c).getAndIncrement();
                } else {
                    Object obj10 = this.b;
                    ((qav) this.a).k.l(1036);
                    qbu.d("%s: Unsubscribe from file %s failed!", "ExpirationHandler", obj10);
                }
                return null;
            case 6:
                String str2 = (String) obj;
                return ((qbo) this.a).a.c().c((int[]) this.c, "mdd_" + ((qbn) this.b).a + "_" + str2, str2);
            default:
                rwc rwcVar = (rwc) obj;
                tpc tpcVarM = suz.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj11 = this.b;
                Object obj12 = this.c;
                suz suzVar = (suz) tpcVarM.b;
                suzVar.b = 1 | suzVar.b;
                suzVar.c = (String) obj12;
                rwc rwcVar2 = (rwc) obj11;
                if (rwcVar2.h()) {
                    svm svmVar = (svm) rwcVar2.c();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    suz suzVar2 = (suz) tpcVarM.b;
                    suzVar2.g = svmVar;
                    suzVar2.b |= 32;
                }
                if (rwcVar.h()) {
                    long jLongValue = ((Long) rwcVar.c()).longValue();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    suz suzVar3 = (suz) tpcVarM.b;
                    suzVar3.b = 2 | suzVar3.b;
                    suzVar3.d = jLongValue;
                }
                rwc rwcVar3 = (rwc) this.a;
                if (rwcVar3.h()) {
                    String simpleName = rwcVar3.c().getClass().getSimpleName();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    suz suzVar4 = (suz) tpcVarM.b;
                    simpleName.getClass();
                    suzVar4.b = 4 | suzVar4.b;
                    suzVar4.e = simpleName;
                    if (((Throwable) rwcVar3.c()).getCause() != null) {
                        String simpleName2 = ((Throwable) rwcVar3.c()).getCause().getClass().getSimpleName();
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        suz suzVar5 = (suz) tpcVarM.b;
                        simpleName2.getClass();
                        suzVar5.b |= 8;
                        suzVar5.f = simpleName2;
                    }
                    if ((rwcVar3.c() instanceof pul) && (iU = rkf.u(((pul) rwcVar3.c()).a.aF)) != 0) {
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        suz suzVar6 = (suz) tpcVarM.b;
                        suzVar6.h = rkf.t(iU);
                        suzVar6.b |= 64;
                    }
                }
                return (suz) tpcVarM.l();
        }
    }

    public /* synthetic */ irm(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ irm(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ irm(kjn kjnVar, List list, ltr ltrVar, int i) {
        this.d = i;
        this.b = kjnVar;
        this.c = list;
        this.a = ltrVar;
    }

    public /* synthetic */ irm(lsp lspVar, ltd ltdVar, ltg ltgVar, int i) {
        this.d = i;
        this.b = lspVar;
        this.a = ltdVar;
        this.c = ltgVar;
    }
}
