package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import j$.nio.channels.DesugarChannels;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gfn implements fyt {
    public static final sgv a = sgv.g("gfn");
    public final lsp b;
    public final Executor c;
    public final hem d;
    public rwc e = rvk.a;
    private final fyw f;
    private final gca g;
    private final luj h;
    private final hbj i;

    public gfn(lsp lspVar, fyw fywVar, gca gcaVar, Executor executor, luj lujVar, hem hemVar, hbj hbjVar) {
        this.b = lspVar;
        this.f = fywVar;
        this.g = gcaVar;
        this.c = executor;
        this.h = lujVar;
        this.d = hemVar;
        this.i = hbjVar;
    }

    public static String a(gbw gbwVar) {
        StringBuilder sb = new StringBuilder();
        List list = gbwVar.n;
        if (!list.isEmpty()) {
            gho ghoVar = (gho) list.get(0);
            gho ghoVar2 = gho.OFF;
            int iOrdinal = ghoVar.ordinal();
            if (iOrdinal == 2) {
                sb.append("CINEMATIC");
            } else if (iOrdinal == 3) {
                sb.append("LOCKED");
            } else if (iOrdinal == 4) {
                sb.append("ACTIVE");
            }
        }
        if (gbwVar.t) {
            if (sb.length() != 0) {
                sb.append(".");
            }
            sb.append("TS");
        }
        if (gbwVar.z && gbwVar.A) {
            if (sb.length() != 0) {
                sb.append(".");
            }
            sb.append("MAIN");
        }
        return sb.toString();
    }

    public static final void m(rwc rwcVar) {
        if (rwcVar.h()) {
            ((lsw) rwcVar.c()).g();
        } else {
            ((sgt) a.b().M(879)).s("No MediaGroup. Publish to MediaStore failed");
        }
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.c.execute(new gbh(this, list, 9));
    }

    @Override // defpackage.fyt
    public final void d() {
    }

    public final void e(gbv gbvVar) {
        lte lteVar = gbvVar.h;
        ltd ltdVar = lteVar.a;
        lsu lsuVar = gbvVar.c;
        lsuVar.b();
        lsw lswVar = gbvVar.d;
        rwc rwcVarJ = rwc.j(lswVar);
        ltf ltfVar = ltf.VIDEO_SNAPSHOT;
        int i = sbp.d;
        l(rwcVarJ, lteVar, lsuVar, ltfVar, false, sex.a);
        m(rwc.j(lswVar));
    }

    @Override // defpackage.fyt
    public final void f() {
    }

    @Override // defpackage.fyt
    public final void g() {
    }

    @Override // defpackage.fyt
    public final void h() {
    }

    @Override // defpackage.fyt
    public final void i() {
    }

    @Override // defpackage.fyt
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fyt
    public final void k(boolean z) {
    }

    public final void l(rwc rwcVar, lte lteVar, lsu lsuVar, ltf ltfVar, boolean z, List list) {
        if (rwcVar.h()) {
            ((lsw) rwcVar.c()).e(new gfm(this, ltfVar, lsuVar, lteVar, z, ((Boolean) this.h.b(luf.aN)).booleanValue() ? ltg.MARS_STORE : ltg.MEDIA_STORE, list));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fyt
    public final void q(kbk kbkVar) {
        if (this.f.o()) {
            this.c.execute(new gbh(this, kbkVar, 6, null));
            return;
        }
        Iterator it = kbkVar.d.iterator();
        while (it.hasNext()) {
            this.d.c(((gbw) it.next()).s.b);
        }
        Iterator it2 = kbkVar.b.iterator();
        while (it2.hasNext()) {
            this.d.c(((gbv) it2.next()).h.b);
        }
        if (this.e.h()) {
            ((lru) this.e.c()).i(9, 9);
        }
    }

    public final void c(rwc rwcVar, rwc rwcVar2, long j, String str, String str2) {
        ArrayList<qer> arrayList;
        if (rwcVar.h() && rwcVar2.h()) {
            if (!this.i.p(gym.L)) {
                gca gcaVar = this.g;
                pos posVar = ((lsu) rwcVar2.c()).b;
                pos posVar2 = ((lsu) rwcVar2.c()).b;
                if (!gcaVar.b.p(gym.P)) {
                    gcaVar.a.b("Not fixing creation time; disabled by flag.");
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int iA = gca.a(j);
                    try {
                        FileInputStream fileInputStreamD = posVar.d();
                        try {
                            qep qepVarE = qep.b(fileInputStreamD).e("moov");
                            qep qepVarA = qepVarE.d(SHXc.ZQKA).a();
                            arrayList2.add(Long.valueOf(qepVarA.f().b + 4));
                            arrayList2.add(Long.valueOf(qepVarA.f().b + 8));
                            qep qepVarA2 = qepVarE.a();
                            byte[] bArrA = qet.a("trak");
                            rwc rwcVar3 = qepVarA2.a;
                            if (!rwcVar3.h()) {
                                arrayList = new ArrayList();
                            } else {
                                qer qerVarB = ((qer) rwcVar3.c()).b();
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    qer qerVarM = qsp.m(qerVarB);
                                    if (qerVarM == null) {
                                        break;
                                    } else if (Arrays.equals(qsp.n(qerVarM), bArrA)) {
                                        arrayList3.add(qerVarM);
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            for (qer qerVar : arrayList) {
                                qep qepVarA3 = qep.c(qerVar).d("tkhd").a();
                                arrayList2.add(Long.valueOf(qepVarA3.f().b + 4));
                                arrayList2.add(Long.valueOf(qepVarA3.f().b + 8));
                                qep qepVarA4 = qep.c(qerVar).d("mdia").d("mdhd").a();
                                arrayList2.add(Long.valueOf(qepVarA4.f().b + 4));
                                arrayList2.add(Long.valueOf(qepVarA4.f().b + 8));
                            }
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamD.getChannel()).position(((Long) it.next()).longValue());
                                int i = new DataInputStream(fileInputStreamD).readInt();
                                if (Integer.compare(i ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) <= 0) {
                                    if (Integer.compare(gca.a(j - TimeUnit.MILLISECONDS.convert(10L, TimeUnit.HOURS)) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE) > 0) {
                                        throw new gbz(a.bv(i, "Existing modification time too early, won' fix: "));
                                    }
                                } else {
                                    throw new gbz(a.bv(i, "Modification time already too large: "));
                                }
                            }
                            fileInputStreamD.close();
                            FileOutputStream fileOutputStreamE = posVar2.e();
                            try {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStreamE.getChannel()).position(((Long) it2.next()).longValue());
                                    new DataOutputStream(fileOutputStreamE).writeInt(iA);
                                }
                                fileOutputStreamE.close();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Exception e) {
                        gcaVar.a.i("Couldn't fix video duration", e);
                    }
                    gcaVar.a.b("Successfully fixed creation time.");
                }
            }
            if (!str2.isEmpty()) {
                ((lsu) rwcVar2.c()).b.h(str2);
            }
            ((lsu) rwcVar2.c()).b();
            return;
        }
        ((sgt) a.b().M(878)).v("No MediaGroup or MediaFile. Could not insert %s video into MediaStore.", str);
    }
}
