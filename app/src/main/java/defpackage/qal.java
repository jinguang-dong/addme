package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qal implements qai {
    private final Context a;
    private final pwt b;
    private final rwc c;
    private final puu d;

    public qal(Context context, pwt pwtVar, rwc rwcVar, puu puuVar) {
        this.a = context;
        this.b = pwtVar;
        this.c = rwcVar;
        this.d = puuVar;
    }

    @Override // defpackage.qai
    public final syu a() {
        qsp.x(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
        return ske.M(null);
    }

    @Override // defpackage.qai
    public final syu c() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        SharedPreferences sharedPreferencesX = qsp.x(context, "gms_icing_mdd_shared_files", this.c);
        SharedPreferences.Editor editorEdit = null;
        for (String str : sharedPreferencesX.getAll().keySet()) {
            try {
                arrayList.add(qsp.G(str, context, this.b));
            } catch (qcv e) {
                qbu.f(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                pwt pwtVar = this.b;
                rwr.c("|").f(str).size();
                pwtVar.a();
                if (editorEdit == null) {
                    editorEdit = sharedPreferencesX.edit();
                }
                editorEdit.remove(str);
            }
        }
        if (editorEdit != null) {
            editorEdit.commit();
        }
        return ske.M(arrayList);
    }

    @Override // defpackage.qai
    public final syu d() {
        boolean z;
        int i;
        int i2;
        Context context;
        pwt pwtVar;
        Context context2;
        pwt pwtVar2;
        Context context3;
        Iterator<String> it;
        Context context4 = this.a;
        if (!prh.k(context4)) {
            int i3 = qbu.a;
            Context context5 = this.a;
            prh.m(context5);
            prh.l(context5, pzj.a(this.d.h()));
            return ske.M(false);
        }
        pzj pzjVarA = pzj.a(this.d.h());
        pwt pwtVar3 = this.b;
        pzj pzjVarJ = prh.j(context4, pwtVar3);
        int i4 = pzjVarA.d;
        int i5 = pzjVarJ.d;
        int i6 = 1;
        if (i4 == i5) {
            z = true;
        } else {
            if (i4 < i5) {
                qbu.e("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", pzjVarJ, pzjVarA);
                new Exception("Downgraded file key from " + String.valueOf(pzjVarJ) + " to " + String.valueOf(pzjVarA) + ".");
                pwtVar3.a();
                prh.l(context4, pzjVarA);
                z = false;
            } else {
                int i7 = i5 + 1;
                while (true) {
                    if (i7 <= i4) {
                        try {
                            pzj pzjVarA2 = pzj.a(i7);
                            int iOrdinal = pzjVarA2.ordinal();
                            if (iOrdinal == i6) {
                                i = i4;
                                i2 = i7;
                                int i8 = qbu.a;
                                SharedPreferences sharedPreferencesX = qsp.x(context4, "gms_icing_mdd_shared_files", this.c);
                                SharedPreferences.Editor editorEdit = sharedPreferencesX.edit();
                                for (String str : sharedPreferencesX.getAll().keySet()) {
                                    try {
                                        pvp pvpVarG = qsp.G(str, context4, pwtVar3);
                                        context2 = context4;
                                        pwtVar2 = pwtVar3;
                                        pvr pvrVar = (pvr) qsp.z(sharedPreferencesX, str, (tqy) pvr.a.a(7, null));
                                        if (pvrVar == null) {
                                            qbu.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            editorEdit.remove(str);
                                        } else {
                                            qsp.C(editorEdit, str);
                                            qsp.D(editorEdit, qsp.K(pvpVarG), pvrVar);
                                        }
                                    } catch (qcv unused) {
                                        context2 = context4;
                                        pwtVar2 = pwtVar3;
                                        qbu.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str);
                                        this.b.a();
                                        editorEdit.remove(str);
                                    }
                                    pwtVar3 = pwtVar2;
                                    context4 = context2;
                                }
                                context = context4;
                                pwtVar = pwtVar3;
                                if (!editorEdit.commit()) {
                                    qbu.b("Failed to commit migration metadata to disk");
                                    pwt pwtVar4 = this.b;
                                    new Exception("Migrate to DownloadTransform failed.");
                                    pwtVar4.a();
                                    break;
                                }
                                prh.l(this.a, pzj.a(i2));
                                i7 = i2 + 1;
                                pwtVar3 = pwtVar;
                                i4 = i;
                                context4 = context;
                                i6 = 1;
                            } else {
                                if (iOrdinal != 2) {
                                    throw new UnsupportedOperationException("Upgrade to version " + pzjVarA2.name() + "not supported!");
                                }
                                int i9 = qbu.a;
                                Context context6 = this.a;
                                SharedPreferences sharedPreferencesX2 = qsp.x(context6, "gms_icing_mdd_shared_files", this.c);
                                SharedPreferences.Editor editorEdit2 = sharedPreferencesX2.edit();
                                Iterator<String> it2 = sharedPreferencesX2.getAll().keySet().iterator();
                                while (it2.hasNext()) {
                                    int i10 = i4;
                                    String next = it2.next();
                                    int i11 = i7;
                                    try {
                                        pvp pvpVarG2 = qsp.G(next, context6, this.b);
                                        context3 = context6;
                                        it = it2;
                                        pvr pvrVar2 = (pvr) qsp.z(sharedPreferencesX2, next, (tqy) pvr.a.a(7, null));
                                        if (pvrVar2 == null) {
                                            qbu.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            editorEdit2.remove(next);
                                        } else {
                                            qsp.C(editorEdit2, next);
                                            qsp.D(editorEdit2, qsp.J(pvpVarG2), pvrVar2);
                                        }
                                    } catch (qcv unused2) {
                                        context3 = context6;
                                        it = it2;
                                        qbu.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", next);
                                        this.b.a();
                                        editorEdit2.remove(next);
                                    }
                                    i7 = i11;
                                    i4 = i10;
                                    context6 = context3;
                                    it2 = it;
                                }
                                i = i4;
                                i2 = i7;
                                if (!editorEdit2.commit()) {
                                    qbu.b("Failed to commit migration metadata to disk");
                                    pwt pwtVar5 = this.b;
                                    new Exception("Migrate to ChecksumOnly failed.");
                                    pwtVar5.a();
                                    break;
                                }
                                context = context4;
                                pwtVar = pwtVar3;
                                prh.l(this.a, pzj.a(i2));
                                i7 = i2 + 1;
                                pwtVar3 = pwtVar;
                                i4 = i;
                                context4 = context;
                                i6 = 1;
                            }
                        } finally {
                            Context context7 = this.a;
                            pwt pwtVar6 = this.b;
                            if (prh.j(context7, pwtVar6).d != pzjVarA.d && !prh.l(context7, pzjVarA)) {
                                qbu.b(mn.i(pzjVarA, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                                new Exception(mn.i(pzjVarA, "Fail to set target version ", "."));
                                pwtVar6.a();
                            }
                        }
                    } else {
                        z = true;
                    }
                }
                Context context8 = this.a;
                pwt pwtVar7 = this.b;
                if (prh.j(context8, pwtVar7).d != pzjVarA.d && !prh.l(context8, pzjVarA)) {
                    qbu.b(mn.i(pzjVarA, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                    new Exception(mn.i(pzjVarA, "Fail to set target version ", "."));
                    pwtVar7.a();
                }
                z = false;
            }
        }
        return ske.M(Boolean.valueOf(z));
    }

    @Override // defpackage.qai
    public final syu e(pvp pvpVar) {
        return qsz.m(f(new sfm(pvpVar)), new pzu(pvpVar, 8), sxo.a);
    }

    @Override // defpackage.qai
    public final syu f(scn scnVar) {
        Context context = this.a;
        SharedPreferences sharedPreferencesX = qsp.x(context, "gms_icing_mdd_shared_files", this.c);
        sbr sbrVar = new sbr();
        sgj sgjVarListIterator = scnVar.listIterator();
        while (sgjVarListIterator.hasNext()) {
            pvp pvpVar = (pvp) sgjVarListIterator.next();
            pvr pvrVar = (pvr) qsp.z(sharedPreferencesX, qsp.H(pvpVar, context, this.b), (tqy) pvr.a.a(7, null));
            if (pvrVar != null) {
                sbrVar.f(pvpVar, pvrVar);
            }
        }
        return ske.M(sbrVar.e());
    }

    @Override // defpackage.qai
    public final syu g(pvp pvpVar) {
        Context context = this.a;
        rwc rwcVar = this.c;
        return ske.M(Boolean.valueOf(qsp.E(qsp.x(context, "gms_icing_mdd_shared_files", rwcVar), qsp.H(pvpVar, context, this.b))));
    }

    @Override // defpackage.qai
    public final syu h(pvp pvpVar, pvr pvrVar) {
        Context context = this.a;
        rwc rwcVar = this.c;
        return ske.M(Boolean.valueOf(qsp.F(qsp.x(context, "gms_icing_mdd_shared_files", rwcVar), qsp.H(pvpVar, context, this.b), pvrVar)));
    }
}
