package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzw implements rvu {
    private final /* synthetic */ int a;

    public /* synthetic */ pzw(int i) {
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        rwc rwcVarJ;
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                pvt pvtVar = (pvt) obj;
                tpc tpcVar = (tpc) pvtVar.a(5, null);
                tpcVar.r(pvtVar);
                if (tpcVar.a.C()) {
                    throw new IllegalArgumentException("Default instance must be immutable.");
                }
                tpcVar.b = tpcVar.k();
                return (pvt) tpcVar.l();
            case 4:
                return true;
            case 5:
                HashMap map = new HashMap();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    qbo.f(map, qbo.i((pvc) it.next()));
                }
                return map;
            case 6:
                HashMap map2 = new HashMap();
                for (qao qaoVar : (Iterable) obj) {
                    pvc pvcVar = qaoVar.b;
                    qbn qbnVarI = qbo.i(pvcVar);
                    HashSet hashSet = new HashSet();
                    vac vacVar = pvcVar.v;
                    if (vacVar == null) {
                        vacVar = vac.a;
                    }
                    int i = true != qaoVar.a.f ? 3 : 4;
                    Iterator it2 = vacVar.b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            vab vabVar = (vab) it2.next();
                            int iAy = a.ay(vabVar.b);
                            if (iAy == 0) {
                                iAy = 1;
                            }
                            if (iAy == i) {
                                rwcVarJ = rwc.j(Integer.valueOf((int) vabVar.c));
                            }
                        } else {
                            rwcVarJ = rvk.a;
                        }
                    }
                    if (rwcVarJ.h()) {
                        hashSet.add(rwcVarJ.c());
                    } else {
                        int i2 = qbu.a;
                        sgv sgvVar = qbt.a;
                        ((sgt) sgvVar.c().M(5666)).v("%s", "No download stage experiment ids found even though experiment info is set.");
                        sgvVar.c().Q();
                    }
                    vac vacVar2 = pvcVar.v;
                    if (vacVar2 == null) {
                        vacVar2 = vac.a;
                    }
                    if (vacVar2.c.size() < 10) {
                        vac vacVar3 = pvcVar.v;
                        if (vacVar3 == null) {
                            vacVar3 = vac.a;
                        }
                        hashSet.addAll(vacVar3.c);
                    } else {
                        vac vacVar4 = pvcVar.v;
                        if (vacVar4 == null) {
                            vacVar4 = vac.a;
                        }
                        qbu.i("Found more experiment ids than mendel experiment ids for logging than allowed. Found %d, limit is %d", Integer.valueOf(vacVar4.c.size()), 10);
                    }
                    if (!hashSet.isEmpty()) {
                        qbo.f(map2, qbnVarI).addAll(hashSet);
                    }
                }
                return map2;
            case 7:
                svk svkVar = (svk) obj;
                sux[] suxVarArr = new sux[1];
                tpc tpcVarM = sux.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                sux suxVar = (sux) tpcVarM.b;
                svkVar.getClass();
                suxVar.j = svkVar;
                suxVar.c |= 8192;
                suxVarArr[0] = (sux) tpcVarM.l();
                return Arrays.asList(suxVarArr);
            case 8:
                ArrayList arrayList = new ArrayList();
                for (qbp qbpVar : (List) obj) {
                    tpc tpcVarM2 = sux.a.m();
                    svd svdVar = qbpVar.a;
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    tph tphVar = tpcVarM2.b;
                    sux suxVar2 = (sux) tphVar;
                    suxVar2.h = svdVar;
                    suxVar2.b |= Integer.MIN_VALUE;
                    suv suvVar = qbpVar.b;
                    if (!tphVar.C()) {
                        tpcVarM2.o();
                    }
                    sux suxVar3 = (sux) tpcVarM2.b;
                    suxVar3.e = suvVar;
                    suxVar3.b |= 256;
                    arrayList.add((sux) tpcVarM2.l());
                }
                return arrayList;
            case 9:
                svh svhVar = (svh) obj;
                sux[] suxVarArr2 = new sux[1];
                tpc tpcVarM3 = sux.a.m();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                sux suxVar4 = (sux) tpcVarM3.b;
                svhVar.getClass();
                suxVar4.l = svhVar;
                suxVar4.c |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                suxVarArr2[0] = (sux) tpcVarM3.l();
                return Arrays.asList(suxVarArr2);
            case 10:
                pvq pvqVar = ((pvo) obj).f;
                return pvqVar == null ? pvq.a : pvqVar;
            case 11:
                return null;
            case 12:
                pud pudVar = ((puf) obj).c;
                if (pudVar == null) {
                    pudVar = pud.a;
                }
                return pudVar.c;
            case 13:
                return qdr.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Boolean.valueOf(((pwv) obj).c);
            case 15:
                return Boolean.valueOf(((pwv) obj).b);
            case 16:
                return Boolean.valueOf(((pwv) obj).a);
            case 17:
                return new dwh();
            case 18:
                return ((MediaCodec) obj).createInputSurface();
            case 19:
                Location location = (Location) obj;
                if (location == null) {
                    return null;
                }
                return Float.valueOf((float) location.getLatitude());
            default:
                Location location2 = (Location) obj;
                if (location2 == null) {
                    return null;
                }
                return Float.valueOf((float) location2.getLongitude());
        }
    }
}
