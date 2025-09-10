package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ezo {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    public final boolean f;

    ezo(boolean z) {
        this.f = z;
    }
}
