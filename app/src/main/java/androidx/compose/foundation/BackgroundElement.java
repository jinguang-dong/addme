package androidx.compose.foundation;

import defpackage.a;
import defpackage.aeu;
import defpackage.bij;
import defpackage.bkv;
import defpackage.blp;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BackgroundElement extends bwa {
    private final long a;
    private final blp b;

    public BackgroundElement(long j, blp blpVar) {
        this.a = j;
        this.b = blpVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new aeu(this.a, this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        aeu aeuVar = (aeu) bijVar;
        aeuVar.a = this.a;
        aeuVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        if (backgroundElement == null) {
            return false;
        }
        long j = this.a;
        long j2 = backgroundElement.a;
        long j3 = bkv.a;
        return a.q(j, j2) && a.ao(null, null) && a.ao(this.b, backgroundElement.b);
    }

    public final int hashCode() {
        long j = bkv.a;
        return (((a.r(this.a) * 961) + Float.floatToIntBits(1.0f)) * 31) + this.b.hashCode();
    }
}
