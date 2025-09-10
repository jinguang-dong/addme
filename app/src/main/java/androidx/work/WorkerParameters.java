package androidx.work;

import defpackage.dvx;
import defpackage.dwc;
import defpackage.dwu;
import defpackage.gga;
import defpackage.uhf;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WorkerParameters {
    public final UUID a;
    public final dvx b;
    public final Executor c;
    public final uhf d;
    public final dwu e;
    public final dwc f;
    public final gga g;

    public WorkerParameters(UUID uuid, dvx dvxVar, Collection collection, Executor executor, uhf uhfVar, gga ggaVar, dwu dwuVar, dwc dwcVar) {
        this.a = uuid;
        this.b = dvxVar;
        new HashSet(collection);
        this.c = executor;
        this.d = uhfVar;
        this.g = ggaVar;
        this.e = dwuVar;
        this.f = dwcVar;
    }
}
