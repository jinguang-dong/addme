package defpackage;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pwe implements sxh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pwe(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v39, types: [java.lang.Object, qcr] */
    /* JADX WARN: Type inference failed for: r14v41, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31, types: [sgt, shi] */
    @Override // defpackage.sxh
    public final syu a() {
        int iAm;
        int i = 5;
        int i2 = 0;
        switch (this.c) {
            case 0:
                return qsz.n(this.b, new kjm(8), ((pwr) this.a).f);
            case 1:
                tpc tpcVarM = pvl.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj = this.a;
                Object obj2 = this.b;
                pvl pvlVar = (pvl) tpcVarM.b;
                String str = ((puv) obj).a;
                str.getClass();
                pvlVar.b |= 1;
                pvlVar.c = str;
                pwr pwrVar = (pwr) obj2;
                String packageName = pwrVar.a.getPackageName();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                pvl pvlVar2 = (pvl) tpcVarM.b;
                packageName.getClass();
                pvlVar2.b = 2 | pvlVar2.b;
                pvlVar2.d = packageName;
                pvl pvlVar3 = (pvl) tpcVarM.l();
                return qsz.n(pwrVar.d.e(pvlVar3, true), new nzm(obj2, obj, pvlVar3, 6, (char[]) null), pwrVar.f);
            case 2:
                ptu ptuVar = (ptu) this.a;
                pud pudVar = ptuVar.a;
                String str2 = pudVar.c;
                String str3 = pudVar.h;
                long j = pudVar.g;
                rwc rwcVar = ptuVar.b;
                String.valueOf(rwcVar.f());
                int i3 = qbu.a;
                Object obj3 = this.b;
                pwr pwrVar2 = (pwr) obj3;
                pwrVar2.e.I();
                if ((pudVar.b & 2) == 0) {
                    tpc tpcVar = (tpc) pudVar.a(5, null);
                    tpcVar.r(pudVar);
                    String packageName2 = pwrVar2.a.getPackageName();
                    if (!tpcVar.b.C()) {
                        tpcVar.o();
                    }
                    pud pudVar2 = (pud) tpcVar.b;
                    packageName2.getClass();
                    pudVar2.b |= 2;
                    pudVar2.d = packageName2;
                    pudVar = (pud) tpcVar.l();
                } else if (!pwrVar2.a.getPackageName().equals(pudVar.d)) {
                    qbu.e("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", pudVar.c, pwrVar2.a.getPackageName(), pudVar.d);
                    return ske.M(false);
                }
                tpc tpcVarM2 = pvl.a.m();
                String str4 = pudVar.c;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                pvl pvlVar4 = (pvl) tphVar;
                str4.getClass();
                pvlVar4.b = 1 | pvlVar4.b;
                pvlVar4.c = str4;
                String str5 = pudVar.d;
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                pvl pvlVar5 = (pvl) tpcVarM2.b;
                str5.getClass();
                pvlVar5.b = 2 | pvlVar5.b;
                pvlVar5.d = str5;
                int i4 = 4;
                if (rwcVar.h()) {
                    String strW = prh.w((Account) rwcVar.c());
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    pvl pvlVar6 = (pvl) tpcVarM2.b;
                    pvlVar6.b |= 4;
                    pvlVar6.e = strW;
                }
                try {
                    byte[] bArrH = pudVar.h();
                    tow towVar = tow.a;
                    tra traVar = tra.a;
                    tph tphVarQ = tph.q(pvc.a, bArrH, 0, bArrH.length, tow.a);
                    tph.D(tphVarQ);
                    pvc pvcVar = (pvc) tphVarQ;
                    Stream map = Collection.EL.stream(pudVar.f).map(new npd(pvcVar, i4));
                    int i5 = sbp.d;
                    sbp sbpVar = (sbp) map.collect(ryv.a);
                    tpc tpcVar2 = (tpc) pvcVar.a(5, null);
                    tpcVar2.r(pvcVar);
                    if (!tpcVar2.b.C()) {
                        tpcVar2.o();
                    }
                    ((pvc) tpcVar2.b).o = trb.a;
                    tpcVar2.B(sbpVar);
                    final pvc pvcVar2 = (pvc) tpcVar2.l();
                    final pzr pzrVar = ((pwr) obj3).d;
                    final pvl pvlVar7 = (pvl) tpcVarM2.l();
                    final sxi sxiVar = ((pwr) obj3).i;
                    String str6 = pvlVar7.c;
                    return qsz.k(qsz.n(pzrVar.f(), new sxi() { // from class: pzo
                        /* JADX WARN: Code restructure failed: missing block: B:143:0x0209, code lost:
                        
                            defpackage.qbu.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", "DataFileGroupValidator", r8, r10.c, r13.c);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:150:0x023a, code lost:
                        
                            r18 = r8;
                            defpackage.qbu.e("%s File details missing in added group = %s, file id = %s", "DataFileGroupValidator", r3.d, r10.c);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
                        
                            r15 = 1;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x018e  */
                        /* JADX WARN: Removed duplicated region for block: B:175:0x02bd  */
                        /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
                        /* JADX WARN: Type inference failed for: r18v0 */
                        /* JADX WARN: Type inference failed for: r18v1 */
                        /* JADX WARN: Type inference failed for: r18v11 */
                        /* JADX WARN: Type inference failed for: r18v12 */
                        /* JADX WARN: Type inference failed for: r18v13 */
                        /* JADX WARN: Type inference failed for: r18v2 */
                        /* JADX WARN: Type inference failed for: r18v3 */
                        /* JADX WARN: Type inference failed for: r18v4 */
                        /* JADX WARN: Type inference failed for: r18v5 */
                        /* JADX WARN: Type inference failed for: r18v6 */
                        /* JADX WARN: Type inference failed for: r18v7, types: [boolean] */
                        /* JADX WARN: Type inference failed for: r18v8 */
                        @Override // defpackage.sxi
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final defpackage.syu a(java.lang.Object r21) throws java.security.NoSuchAlgorithmException, defpackage.pye, defpackage.qan {
                            /*
                                Method dump skipped, instructions count: 996
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.pzo.a(java.lang.Object):syu");
                        }
                    }, pzrVar.k), IOException.class, new kjm(10), ((pwr) obj3).f);
                } catch (tpz e) {
                    qbu.g(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
                    return ske.M(false);
                }
            case 3:
                final pun punVar = (pun) this.a;
                String str7 = punVar.a;
                pxu pxuVarA = pxu.a(str7);
                tpc tpcVarM3 = pvl.a.m();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                Object obj4 = this.b;
                pvl pvlVar8 = (pvl) tpcVarM3.b;
                str7.getClass();
                pvlVar8.b |= 1;
                pvlVar8.c = str7;
                final pwr pwrVar3 = (pwr) obj4;
                String packageName3 = pwrVar3.a.getPackageName();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                pvl pvlVar9 = (pvl) tpcVarM3.b;
                packageName3.getClass();
                pvlVar9.b |= 2;
                pvlVar9.d = packageName3;
                boolean zH = punVar.h.h();
                pvl pvlVar10 = (pvl) tpcVarM3.l();
                qaq qaqVar = pwrVar3.l;
                pyf pyfVar = new pyf(pwrVar3, pxuVarA, pvlVar10, zH, punVar, str7, 1);
                Executor executor = pwrVar3.f;
                return qsz.n(qaqVar.i(pyfVar, executor), new sxi() { // from class: pwg
                    @Override // defpackage.sxi
                    public final syu a(Object obj5) throws Resources.NotFoundException {
                        pxu pxuVar;
                        boolean z;
                        pya pyaVar = (pya) obj5;
                        int iB = pyaVar.b() - 1;
                        if (iB == 1) {
                            return pyaVar.c();
                        }
                        if (iB == 2) {
                            return ske.M(pyaVar.a());
                        }
                        pun punVar2 = punVar;
                        pwr pwrVar4 = pwrVar3;
                        pvc pvcVarD = pyaVar.d();
                        Context context = pwrVar4.a;
                        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("download-notification-channel-id", context.getResources().getString(R.string.mdd_download_notification_channel_name), 3));
                        tpc tpcVarM4 = pvl.a.m();
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        String str8 = punVar2.a;
                        pvl pvlVar11 = (pvl) tpcVarM4.b;
                        str8.getClass();
                        pvlVar11.b |= 1;
                        pvlVar11.c = str8;
                        String packageName4 = context.getPackageName();
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        pvl pvlVar12 = (pvl) tpcVarM4.b;
                        packageName4.getClass();
                        pvlVar12.b |= 2;
                        pvlVar12.d = packageName4;
                        pvl pvlVar13 = (pvl) tpcVarM4.l();
                        pxu pxuVarA2 = pxu.a(str8);
                        int i6 = punVar2.i;
                        pve pveVar = pvcVarD.m;
                        if (pveVar == null) {
                            pveVar = pve.a;
                        }
                        int iAx = a.ax(pveVar.d);
                        if (iAx == 0) {
                            iAx = 1;
                        }
                        int i7 = iAx - 1;
                        String string = (i7 == 0 || i7 == 2) ? context.getResources().getString(R.string.mdd_notification_download_paused_wifi) : context.getResources().getString(R.string.mdd_notification_download_paused);
                        long j2 = i6;
                        clr clrVar = new clr(context);
                        pxu pxuVarA3 = pxu.a(str8);
                        str8.getClass();
                        str8.getClass();
                        clm clmVarS = prh.s(context);
                        clmVarS.f(str8);
                        clmVarS.e(str8);
                        clmVarS.g = null;
                        clmVarS.i(android.R.drawable.stat_sys_download);
                        clmVarS.g(true);
                        int i8 = (int) j2;
                        clmVarS.h(i8, 0, false);
                        int iHashCode = str8.hashCode();
                        if (punVar2.k == 2) {
                            Class cls = (Class) pwrVar4.h.c();
                            String str9 = pxuVarA3.a;
                            pxuVar = pxuVarA2;
                            Intent intent = new Intent(context, (Class<?>) cls);
                            intent.setPackage(context.getPackageName());
                            intent.putExtra("cancel-action", iHashCode);
                            intent.putExtra("key", str9);
                            z = false;
                            PendingIntent foregroundService = PendingIntent.getForegroundService(context, iHashCode, rbo.a(intent, 1140850688, 0), 1140850688);
                            String string2 = context.getResources().getString(R.string.mdd_notification_action_cancel);
                            foregroundService.getClass();
                            IconCompat iconCompatB = IconCompat.b(android.R.drawable.stat_sys_warning);
                            Bundle bundle = new Bundle();
                            CharSequence charSequenceC = clm.c(string2);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            if (!arrayList.isEmpty()) {
                            }
                            clmVarS.b.add(new clk(iconCompatB, charSequenceC, foregroundService, bundle, arrayList2.isEmpty() ? null : (cgh[]) arrayList2.toArray(new cgh[arrayList2.size()])));
                            clrVar.a(iHashCode, clmVarS.a());
                        } else {
                            pxuVar = pxuVarA2;
                            z = false;
                        }
                        pxu pxuVar2 = pxuVar;
                        pwo pwoVar = new pwo(pwrVar4, pxuVarA3, j2 <= 0 ? true : z, punVar2, clmVarS, i8, clrVar, iHashCode, string);
                        ((qdc) pwrVar4.g.c()).c(str8, pwoVar);
                        try {
                            rvk rvkVar = rvk.a;
                            syv syvVar = new syv(new ire(7));
                            qdp qdpVarE = qdp.e(syvVar);
                            nzm nzmVar = new nzm((Object) pwrVar4, (Object) pvlVar13, (Object) rvkVar, 2);
                            Executor executor2 = pwrVar4.f;
                            qdp qdpVarF = qdpVarE.g(nzmVar, executor2).g(new nzm((Object) pwrVar4, pvlVar13, (Object) punVar2, 3), executor2).f(new mdv(15), executor2);
                            syu syuVarN = qsz.n(pwrVar4.j.c(pxuVar2.a, qdpVarF), new kjl(syvVar, qdpVarF, 11, null), executor2);
                            qsz.o(syuVarN, new fxw(pwoVar, 16), executor2);
                            return syuVarN;
                        } catch (tpz e2) {
                            return ske.L(e2);
                        }
                    }
                }, executor);
            case 4:
                Object obj5 = this.a;
                pzb pzbVar = (pzb) this.b;
                pvl pvlVar11 = (pvl) obj5;
                syu syuVarG = pzbVar.g(pvlVar11, false);
                syu syuVarG2 = pzbVar.g(pvlVar11, true);
                return qsp.Q(syuVarG, syuVarG2).g(new pwe(syuVarG, syuVarG2, i), pzbVar.g);
            case 5:
                return ske.M(new qap((pvc) ske.U(this.a), (pvc) ske.U(this.b)));
            case 6:
                ArrayList arrayList = new ArrayList();
                while (true) {
                    ?? r1 = this.a;
                    if (i2 >= r1.size()) {
                        return ske.M(arrayList);
                    }
                    ?? r2 = this.b;
                    pvl pvlVar12 = (pvl) r1.get(i2);
                    pvc pvcVar3 = (pvc) ske.U((Future) r2.get(i2));
                    if (pvcVar3 != null) {
                        arrayList.add(new qao(pvlVar12, pvcVar3));
                    }
                    i2++;
                }
            case 7:
                Object obj6 = this.b;
                Object obj7 = this.a;
                try {
                    ?? r0 = ((tql) obj7).d;
                    r0.remove(obj6);
                    ((tql) obj7).b.b((String) obj6, r0.size());
                    return syq.a;
                } catch (Exception e2) {
                    qbu.g(e2, "%s: Failed to remove download future (%s) from map", "DownloadFutureMap", obj6);
                    return ske.L(e2);
                }
            case 8:
                Object obj8 = this.a;
                qub qubVar = (qub) obj8;
                qua quaVar = (qua) qubVar.c.a();
                tpc tpcVarM4 = uyk.a.m();
                Iterator it = this.b.iterator();
                if (!it.hasNext()) {
                    tpc tpcVarM5 = uzu.a.m();
                    if (!tpcVarM5.b.C()) {
                        tpcVarM5.o();
                    }
                    uzu uzuVar = (uzu) tpcVarM5.b;
                    uyk uykVar = (uyk) tpcVarM4.l();
                    uykVar.getClass();
                    uzuVar.g = uykVar;
                    uzuVar.b |= 32;
                    uzu uzuVar2 = (uzu) tpcVarM5.l();
                    try {
                        rwc rwcVar2 = ((qty) ((qub) obj8).b.a()).a;
                    } catch (Exception e3) {
                        ((sgt) ((sgt) qnj.a.c().i(e3)).M((char) 5762)).s("Exception while getting network metric extension!");
                    }
                    qqp qqpVar = qubVar.a;
                    qql qqlVarA = qqm.a();
                    qqlVarA.f(uzuVar2);
                    qqlVarA.b = null;
                    return qqpVar.b(qqlVarA.a());
                }
                qtz qtzVar = (qtz) it.next();
                tpc tpcVarM6 = uyj.a.m();
                int i6 = qtzVar.d;
                int i7 = qtzVar.c;
                long j2 = qtzVar.b;
                long j3 = qtzVar.a;
                int i8 = qtzVar.g;
                if (!tpcVarM6.b.C()) {
                    tpcVarM6.o();
                }
                uyj uyjVar = (uyj) tpcVarM6.b;
                uyjVar.b |= 32;
                uyjVar.c = 0;
                int i9 = qtzVar.j;
                tpc tpcVarM7 = uyl.a.m();
                int i10 = qtzVar.j;
                if (!tpcVarM7.b.C()) {
                    tpcVarM7.o();
                }
                uyl uylVar = (uyl) tpcVarM7.b;
                uylVar.b = 1 | uylVar.b;
                uylVar.c = 0;
                uyl uylVar2 = (uyl) tpcVarM7.l();
                if (!tpcVarM6.b.C()) {
                    tpcVarM6.o();
                }
                uyj uyjVar2 = (uyj) tpcVarM6.b;
                uylVar2.getClass();
                uyjVar2.g = uylVar2;
                uyjVar2.b |= 4194304;
                String str8 = qtzVar.h;
                String str9 = qtzVar.f;
                if (!rnt.V(null)) {
                    throw null;
                }
                if (!tpcVarM6.b.C()) {
                    tpcVarM6.o();
                }
                uyj uyjVar3 = (uyj) tpcVarM6.b;
                uyjVar3.d = 0;
                uyjVar3.b |= 256;
                ((qmx) quaVar.a).a();
                String str10 = qtzVar.e;
                uyx uyxVar = qtzVar.i;
                throw null;
            default:
                quj qujVar = (quj) this.a;
                if (!qujVar.a.c(null)) {
                    return syq.a;
                }
                tpc tpcVar3 = (tpc) this.b;
                uyr uyrVar = (uyr) tpcVar3.b;
                int i11 = uyrVar.s;
                int iAm2 = a.am(i11);
                if (((iAm2 != 0 && iAm2 == 3) || ((iAm = a.am(i11)) != 0 && iAm == 2)) && (uyrVar.b & 16) == 0) {
                    return syq.a;
                }
                qud qudVar = (qud) qujVar.b.a();
                rwc rwcVar3 = qudVar.b;
                rwc rwcVar4 = qudVar.a;
                rvk rvkVar = rvk.a;
                syu syuVarM = ske.M(rvkVar);
                syu syuVarM2 = ske.M(rvkVar);
                return ske.F(syuVarM, syuVarM2).b(new pwf(qujVar, tpcVar3, syuVarM, syuVarM2, 5), sxo.a);
        }
    }

    public /* synthetic */ pwe(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
