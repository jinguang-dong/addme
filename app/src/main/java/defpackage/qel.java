package defpackage;

import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qel implements qez {
    public final Executor e;
    public final rwc f;
    public final qaq g;
    private final FileOutputStream h;
    public boolean a = false;
    public boolean b = false;
    public final szh c = new szh();
    public final Set d = new HashSet();
    private int i = 0;

    public qel(rwc rwcVar, FileOutputStream fileOutputStream, qaq qaqVar, Executor executor) {
        this.g = qaqVar;
        this.f = rwcVar;
        this.e = new vcs(this, new szg(executor), 1);
        this.h = fileOutputStream;
    }

    @Override // defpackage.qez
    public final synchronized qfc a() {
        qek qekVar;
        int i = this.i;
        this.i = i + 1;
        qekVar = new qek(this, i);
        this.e.execute(new pev(this, qekVar, 9, null));
        return qekVar;
    }

    @Override // defpackage.qez
    public final syu b() {
        return new qhc(this.c, 1);
    }

    @Override // defpackage.qez
    public final void c() {
        this.e.execute(new oze(this, 11));
    }

    @Override // defpackage.qez
    public final synchronized void d() {
        this.e.execute(new oze(this, 12));
    }

    public final void e(String str, String str2) {
        this.g.c(new czb(str, cza.d(str2), 1));
    }

    public final void f() {
        if (this.a && this.d.isEmpty() && !this.b) {
            this.g.d();
            this.b = true;
            this.h.close();
            this.c.e(null);
        }
    }
}
