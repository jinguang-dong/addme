package defpackage;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gby implements gcc {
    public static final sgv a = sgv.g("gby");
    public final lsw b;
    public FileOutputStream c;
    public final szh d = new szh();
    private final lsu e;
    private final ExecutorService f;
    private final pbn g;
    private int h;

    public gby(lsw lswVar, lsu lsuVar, ExecutorService executorService, pbn pbnVar) {
        this.b = lswVar;
        this.e = lsuVar;
        this.f = executorService;
        this.g = pbnVar;
        executorService.execute(pbnVar.c("MFOV#Init", new gbh(this, lsuVar, 2)));
        this.h = 1;
        UUID.randomUUID().toString();
    }

    @Override // defpackage.gcc
    public final /* synthetic */ ltg a() {
        return ezh.E(this);
    }

    @Override // defpackage.gcc
    public final rwc b() {
        return rwc.j(this.e);
    }

    @Override // defpackage.gcc
    public final rwc c() {
        return rwc.j(this.b);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            return;
        }
        this.h = 2;
        this.f.execute(new gba(this, 5));
    }

    @Override // defpackage.gcc
    public final syu d() {
        return this.d;
    }

    @Override // defpackage.gcc
    public final FileDescriptor e() {
        try {
            try {
                this.g.f("MFOV#getFileDescriptor");
                return (FileDescriptor) this.d.s();
            } catch (InterruptedException | ExecutionException e) {
                ((sgt) ((sgt) a.b().i(e)).M(696)).s("Can't get file descriptor.");
                throw new RuntimeException(e);
            }
        } finally {
            this.g.g();
        }
    }

    @Override // defpackage.gcc
    public final synchronized void f() {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            return;
        }
        this.h = 3;
        this.f.execute(new gba(this, 6));
    }
}
