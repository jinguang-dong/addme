package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fyx {
    RECORDING,
    PAUSED,
    REVIEW,
    READY;

    public final boolean a() {
        return this == PAUSED || this == RECORDING;
    }
}
