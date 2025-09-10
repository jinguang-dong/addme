package defpackage;

import j$.time.ZoneId;
import j$.util.DesugarTimeZone;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gev implements oyg {
    private final boolean a;
    private final pbn b;
    private final hbj c;

    public gev(hbj hbjVar, pbn pbnVar) {
        this.c = hbjVar;
        this.a = hbjVar.p(gym.av);
        this.b = pbnVar;
    }

    @Override // defpackage.oyg
    public final pop a(FileDescriptor fileDescriptor, int i) {
        FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
        boolean z = this.a;
        qem qemVar = new qem(fileOutputStream, z, this.b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        DesugarTimeZone.getTimeZone(ZoneId.systemDefault());
        qemVar.f(jCurrentTimeMillis, jCurrentTimeMillis);
        gzi gziVar = gym.a;
        return new qei(qemVar, ojl.bZ("gca-muxer"), z);
    }
}
