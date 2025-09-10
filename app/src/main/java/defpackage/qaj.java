package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qaj implements pzc {
    public final Executor a;
    private final Context b;
    private final pwt c;
    private final rwc d;

    public qaj(Context context, pwt pwtVar, rwc rwcVar, Executor executor) {
        this.b = context;
        this.c = pwtVar;
        this.d = rwcVar;
        this.a = executor;
    }

    @Override // defpackage.pzc
    public final syu a(pvc pvcVar) {
        int i = qbu.a;
        pvc pvcVarAa = qsp.aa(pvcVar, (prh.q() / 1000) + pvcVar.k);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pvcVarAa);
        return m(arrayList);
    }

    @Override // defpackage.pzc
    public final syu b() {
        Context context = this.b;
        rwc rwcVar = this.d;
        qsp.x(context, "gms_icing_mdd_groups", rwcVar).edit().clear().commit();
        qsp.x(context, "gms_icing_mdd_group_key_properties", rwcVar).edit().clear().commit();
        return k();
    }

    @Override // defpackage.pzc
    public final syu c() {
        return qsz.n(d(), new qaz(this, 1), this.a);
    }

    @Override // defpackage.pzc
    public final syu d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences sharedPreferencesX = qsp.x(this.b, "gms_icing_mdd_groups", this.d);
        SharedPreferences.Editor editorEdit = null;
        for (String str : sharedPreferencesX.getAll().keySet()) {
            try {
                arrayList.add(qsp.U(str));
            } catch (qct e) {
                qbu.f(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                this.c.a();
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

    @Override // defpackage.pzc
    public final syu e() throws IOException {
        List listM;
        File fileV = qsp.V(this.b, this.d);
        try {
            FileInputStream fileInputStream = new FileInputStream(fileV);
            try {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) fileV.length());
                listM = null;
                try {
                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).read(byteBufferAllocate);
                    byteBufferAllocate.rewind();
                    listM = qsp.M(byteBufferAllocate, pvc.class, (tqy) pvc.a.a(7, null));
                    fileInputStream.close();
                } catch (IOException e) {
                    qbu.g(e, "%s: IOException occurred while reading file groups.", "FileGroupsMetadataUtil");
                }
                if (listM == null) {
                    int i = sbp.d;
                    listM = sex.a;
                }
            } catch (IllegalArgumentException e2) {
                qbu.g(e2, "%s: Exception while reading from stale groups into buffer.", "FileGroupsMetadataUtil");
                int i2 = sbp.d;
                listM = sex.a;
            }
        } catch (FileNotFoundException unused) {
            fileV.getAbsolutePath();
            int i3 = qbu.a;
            int i4 = sbp.d;
            listM = sex.a;
        }
        return ske.M(listM);
    }

    @Override // defpackage.pzc
    public final syu f() {
        return syq.a;
    }

    @Override // defpackage.pzc
    public final syu g(pvl pvlVar) {
        Context context = this.b;
        return ske.M((pvc) qsp.z(qsp.x(context, "gms_icing_mdd_groups", this.d), qsp.W(pvlVar), (tqy) pvc.a.a(7, null)));
    }

    @Override // defpackage.pzc
    public final syu h(pvl pvlVar) {
        Context context = this.b;
        return ske.M((pvm) qsp.z(qsp.x(context, "gms_icing_mdd_group_key_properties", this.d), qsp.W(pvlVar), (tqy) pvm.a.a(7, null)));
    }

    @Override // defpackage.pzc
    public final syu i(pvl pvlVar) {
        Context context = this.b;
        rwc rwcVar = this.d;
        return ske.M(Boolean.valueOf(qsp.E(qsp.x(context, "gms_icing_mdd_groups", rwcVar), qsp.W(pvlVar))));
    }

    @Override // defpackage.pzc
    public final syu j(List list) {
        SharedPreferences.Editor editorEdit = qsp.x(this.b, "gms_icing_mdd_groups", this.d).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pvl pvlVar = (pvl) it.next();
            String str = pvlVar.c;
            String str2 = pvlVar.d;
            int i = qbu.a;
            editorEdit.remove(qsp.B(pvlVar));
        }
        return ske.M(Boolean.valueOf(editorEdit.commit()));
    }

    @Override // defpackage.pzc
    public final syu k() {
        n().delete();
        return syq.a;
    }

    @Override // defpackage.pzc
    public final syu l(pvl pvlVar, pvc pvcVar) {
        Context context = this.b;
        rwc rwcVar = this.d;
        return ske.M(Boolean.valueOf(qsp.F(qsp.x(context, "gms_icing_mdd_groups", rwcVar), qsp.W(pvlVar), pvcVar)));
    }

    @Override // defpackage.pzc
    public final syu m(List list) throws IOException {
        File fileN = n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileN, true);
            try {
                ByteBuffer byteBufferL = qsp.L(list);
                if (byteBufferL != null) {
                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).write(byteBufferL);
                }
                fileOutputStream.close();
                return ske.M(true);
            } catch (IOException unused) {
                qbu.b("IOException occurred while writing file groups.");
                return ske.M(false);
            }
        } catch (FileNotFoundException unused2) {
            qbu.c("File %s not found while writing.", fileN.getAbsolutePath());
            return ske.M(false);
        }
    }

    final File n() {
        return qsp.V(this.b, this.d);
    }
}
