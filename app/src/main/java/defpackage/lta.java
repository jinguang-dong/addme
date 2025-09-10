package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lta {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;

    public lta(lsr lsrVar, String str, String str2) {
        this.d = lsrVar;
        this.a = str;
        this.b = str2;
        this.c = null;
    }

    public final synchronized File a() {
        return (File) this.c;
    }

    public final synchronized boolean b() {
        return a() != null;
    }

    public final synchronized boolean c() {
        if (this.c != null) {
            return true;
        }
        try {
            Object obj = this.d;
            Object obj2 = this.a;
            Object obj3 = this.b;
            File file = new File(new File(((lsr) obj).a((String) obj2), (String) obj3), ((String) obj3).concat(".jpg"));
            rup.h(file);
            if ((!file.createNewFile() || !file.canWrite()) && !file.canWrite()) {
                throw new IOException("Temporary output file is not writeable.");
            }
            this.c = file;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public lta(plc plcVar, cxb cxbVar) {
        this.b = new AtomicLong(-1L);
        this.a = plcVar;
        this.d = cxbVar;
    }
}
