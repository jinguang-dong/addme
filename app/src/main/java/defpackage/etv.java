package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etv implements ett {
    private final File a;
    private epq b;
    private final jod d = new jod((byte[]) null, (byte[]) null);
    private final jod c = new jod((char[]) null);

    @Deprecated
    public etv(File file) {
        this.a = file;
    }

    private final synchronized epq c() {
        if (this.b == null) {
            File file = this.a;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    epq.e(file2, file3, false);
                }
            }
            epq epqVar = new epq(file);
            if (epqVar.b.exists()) {
                try {
                    epqVar.c();
                    epq.b(epqVar.c);
                    Iterator it = epqVar.g.values().iterator();
                    while (it.hasNext()) {
                        epp eppVar = (epp) it.next();
                        if (eppVar.f == null) {
                            for (int i = 0; i < epqVar.d; i = 1) {
                                epqVar.e += eppVar.b[0];
                            }
                        } else {
                            eppVar.f = null;
                            for (int i2 = 0; i2 < epqVar.d; i2 = 1) {
                                epq.b(eppVar.c());
                                epq.b(eppVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    epqVar.close();
                    ept.b(epqVar.a);
                }
                this.b = epqVar;
            } else {
                file.mkdirs();
                epqVar = new epq(file);
                epqVar.d();
                this.b = epqVar;
            }
        }
        return this.b;
    }

    @Override // defpackage.ett
    public final File a(eqi eqiVar) {
        try {
            ejs ejsVarJ = c().j(this.c.w(eqiVar));
            if (ejsVarJ != null) {
                return ((File[]) ejsVarJ.a)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [eqa, java.lang.Object] */
    @Override // defpackage.ett
    public final void b(eqi eqiVar, tdy tdyVar) {
        odb odbVar;
        File fileD;
        odb odbVar2;
        jod jodVar = this.d;
        String strW = this.c.w(eqiVar);
        synchronized (jodVar) {
            odbVar = (odb) jodVar.a.get(strW);
            if (odbVar == null) {
                ?? r1 = ((ejt) jodVar.b).a;
                synchronized (r1) {
                    odbVar2 = (odb) r1.poll();
                }
                odbVar = odbVar2 == null ? new odb((byte[]) null) : odbVar2;
                jodVar.a.put(strW, odbVar);
            }
            odbVar.a++;
        }
        odbVar.b.lock();
        try {
            try {
                epq epqVarC = c();
                if (epqVarC.j(strW) == null) {
                    epo epoVarH = epqVarC.h(strW);
                    if (epoVarH == null) {
                        throw new IllegalStateException(mn.g(strW, "Had two simultaneous puts for: "));
                    }
                    try {
                        epq epqVar = epoVarH.d;
                        synchronized (epqVar) {
                            epp eppVar = epoVarH.a;
                            if (eppVar.f != epoVarH) {
                                throw new IllegalStateException();
                            }
                            if (!eppVar.e) {
                                epoVarH.b[0] = true;
                            }
                            fileD = eppVar.d();
                            epqVar.a.mkdirs();
                        }
                        if (tdyVar.b.a(tdyVar.a, fileD, (eqm) tdyVar.c)) {
                            epqVar.a(epoVarH, true);
                            epoVarH.c = true;
                        }
                    } finally {
                        epoVarH.b();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.x(strW);
        }
    }
}
