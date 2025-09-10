package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum sib {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);

    public final boolean f;

    sib(boolean z) {
        this.f = z;
    }
}
