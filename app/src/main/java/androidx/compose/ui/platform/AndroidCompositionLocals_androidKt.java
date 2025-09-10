package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.google.ar.core.R;
import defpackage.a;
import defpackage.aal;
import defpackage.aat;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.ayp;
import defpackage.ayr;
import defpackage.ayz;
import defpackage.azb;
import defpackage.azr;
import defpackage.azz;
import defpackage.bag;
import defpackage.bai;
import defpackage.bap;
import defpackage.bay;
import defpackage.bbp;
import defpackage.bdq;
import defpackage.bfx;
import defpackage.bfy;
import defpackage.bfz;
import defpackage.bnk;
import defpackage.boq;
import defpackage.bw;
import defpackage.bxv;
import defpackage.byj;
import defpackage.byk;
import defpackage.byl;
import defpackage.bym;
import defpackage.byn;
import defpackage.byx;
import defpackage.byz;
import defpackage.bze;
import defpackage.bzf;
import defpackage.bzg;
import defpackage.bzh;
import defpackage.bzi;
import defpackage.bzv;
import defpackage.cxu;
import defpackage.det;
import defpackage.dew;
import defpackage.ocq;
import defpackage.pfl;
import defpackage.ufg;
import defpackage.uiq;
import defpackage.uiu;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final ayp a = new ayz(bap.c, bnk.f);
    public static final ayp b = new bbp(bnk.g);
    public static final ayp c = new ayr(byj.a);
    public static final ayp d = new bbp(bnk.h);
    public static final ayp e = new bbp(bnk.i);
    public static final ayp f = new bbp(bnk.j);

    /* JADX WARN: Type inference failed for: r12v12, types: [deu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [bbo, java.lang.Object] */
    public static final void a(bxv bxvVar, uiu uiuVar, ayc aycVar, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        int i2 = i & 6;
        ayc aycVarC = aycVar.c(-520299287);
        int i3 = 4;
        int i4 = i2 == 0 ? (true != aycVarC.D(bxvVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != aycVarC.D(uiuVar) ? 16 : 32;
        }
        if (aycVarC.H((i4 & 19) != 18, i4 & 1)) {
            Context context = bxvVar.getContext();
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                azz azzVar = new azz(new Configuration(context.getResources().getConfiguration()), bap.c);
                aygVar.ac(azzVar);
                objR = azzVar;
            }
            azr azrVar = (azr) objR;
            Object objR2 = aygVar.R();
            if (objR2 == obj) {
                objR2 = new aal(azrVar, 15);
                aygVar.ac(objR2);
            }
            bxvVar.q = (uiq) objR2;
            Object objR3 = aygVar.R();
            if (objR3 == obj) {
                objR3 = new byx();
                aygVar.ac(objR3);
            }
            byx byxVar = (byx) objR3;
            byz byzVarE = bxvVar.E();
            if (byzVarE == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objR4 = aygVar.R();
            if (objR4 == obj) {
                ?? r12 = byzVarE.b;
                int i5 = bzi.a;
                Object parent = bxvVar.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = bfx.class.getSimpleName() + ':' + strValueOf;
                det savedStateRegistry = r12.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                bfy bfyVar = new bfy(linkedHashMap, byj.c);
                try {
                    savedStateRegistry.b(str, new bw(bfyVar, i3));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                objR4 = new bzg(bfyVar, new bzh(z, savedStateRegistry, str));
                aygVar.ac(objR4);
            }
            bzg bzgVar = (bzg) objR4;
            ufg ufgVar = ufg.a;
            boolean zD = aycVarC.D(bzgVar);
            Object objR5 = aygVar.R();
            if (zD || objR5 == ayb.a) {
                objR5 = new aal(bzgVar, 16);
                aygVar.ac(objR5);
            }
            azb.c(ufgVar, (uiq) objR5, aycVarC);
            Object objR6 = aygVar.R();
            Object obj2 = ayb.a;
            if (objR6 == obj2) {
                objR6 = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2) ? new bzf() : new bzv();
                aygVar.ac(objR6);
            }
            boq boqVar = (boq) objR6;
            Configuration configurationC = c(azrVar);
            Object objR7 = aygVar.R();
            if (objR7 == obj2) {
                objR7 = new ocq((byte[]) null, (byte[]) null, (byte[]) null);
                aygVar.ac(objR7);
            }
            ocq ocqVar = (ocq) objR7;
            Object objR8 = aygVar.R();
            Object obj3 = objR8;
            if (objR8 == obj2) {
                Configuration configuration = new Configuration();
                if (configurationC != null) {
                    configuration.setTo(configurationC);
                }
                aygVar.ac(configuration);
                obj3 = configuration;
            }
            Configuration configuration2 = (Configuration) obj3;
            Object objR9 = aygVar.R();
            if (objR9 == obj2) {
                objR9 = new bym(configuration2, ocqVar);
                aygVar.ac(objR9);
            }
            bym bymVar = (bym) objR9;
            boolean zD2 = aycVarC.D(context);
            Object objR10 = aygVar.R();
            if (zD2 || objR10 == obj2) {
                objR10 = new aat(context, bymVar, 4);
                aygVar.ac(objR10);
            }
            azb.c(ocqVar, (uiq) objR10, aycVarC);
            Object objR11 = aygVar.R();
            if (objR11 == obj2) {
                objR11 = new pfl((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aygVar.ac(objR11);
            }
            pfl pflVar = (pfl) objR11;
            Object objR12 = aygVar.R();
            if (objR12 == obj2) {
                objR12 = new byn(pflVar);
                aygVar.ac(objR12);
            }
            byn bynVar = (byn) objR12;
            boolean zD3 = aycVarC.D(context);
            Object objR13 = aygVar.R();
            if (zD3 || objR13 == obj2) {
                objR13 = new aat(context, bynVar, 5);
                aygVar.ac(objR13);
            }
            azb.c(pflVar, (uiq) objR13, aycVarC);
            ayp aypVar = bze.l;
            boolean zBooleanValue = ((Boolean) aycVarC.e(aypVar)).booleanValue();
            ocq ocqVar2 = bxvVar.T;
            bay.L(new bag[]{a.b(c(azrVar)), b.b(context), cxu.a.b(byzVarE.a), dew.a.b(byzVarE.b), bfz.a.b(bzgVar), f.b(bxvVar), d.b(ocqVar), e.b(pflVar), aypVar.b(Boolean.valueOf(zBooleanValue | (ocqVar2 != null ? ((Boolean) ocqVar2.a.a()).booleanValue() : false))), bze.f.b(boqVar)}, bdq.k(1059770793, new byk(bxvVar, byxVar, uiuVar), aycVarC), aycVarC, 56);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new byl(bxvVar, uiuVar, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(a.bw(str, "CompositionLocal ", " not present"));
    }

    private static final Configuration c(azr azrVar) {
        return (Configuration) azrVar.a();
    }
}
