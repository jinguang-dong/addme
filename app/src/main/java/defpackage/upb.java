package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upb extends ugx implements uol {
    public static final upb a = new upb();

    private upb() {
        super(uol.c);
    }

    @Override // defpackage.uol
    public final boolean fZ() {
        return false;
    }

    @Override // defpackage.uol
    @ueo
    public final ump ga(uov uovVar) {
        return upc.a;
    }

    @Override // defpackage.uol
    @ueo
    public final Object m(uhb uhbVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.uol
    @ueo
    public final CancellationException n() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.uol
    @ueo
    public final unt o(uiq uiqVar) {
        return upc.a;
    }

    @Override // defpackage.uol
    @ueo
    public final unt p(boolean z, boolean z2, uiq uiqVar) {
        return upc.a;
    }

    @Override // defpackage.uol
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.uol
    public final boolean v() {
        throw null;
    }

    @Override // defpackage.uol
    @ueo
    public final boolean w() {
        return false;
    }

    @Override // defpackage.uol
    @ueo
    public final void s(CancellationException cancellationException) {
    }
}
