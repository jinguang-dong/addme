package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqf implements eqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public eqf(erj erjVar, etl etlVar, int i) {
        this.c = i;
        this.b = erjVar;
        this.a = etlVar;
    }

    @Override // defpackage.eqg
    public final int a(eqc eqcVar) throws Throwable {
        exi exiVar;
        Object obj;
        int i = this.c;
        if (i == 0) {
            try {
                return eqcVar.c((InputStream) this.a, (etl) this.b);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        if (i == 1) {
            try {
                return eqcVar.d((ByteBuffer) this.a, (etl) this.b);
            } finally {
                fak.b((ByteBuffer) this.a);
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(((erj) this.b).a().getFileDescriptor());
            obj = this.a;
            exiVar = new exi(fileInputStream, (etl) obj);
        } catch (Throwable th) {
            th = th;
            exiVar = null;
        }
        try {
            int iC = eqcVar.c(exiVar, (etl) obj);
            exiVar.b();
            ((erj) this.b).a();
            return iC;
        } catch (Throwable th2) {
            th = th2;
            if (exiVar != null) {
                exiVar.b();
            }
            ((erj) this.b).a();
            throw th;
        }
    }

    public eqf(Object obj, etl etlVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = etlVar;
    }
}
