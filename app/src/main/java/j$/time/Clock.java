package j$.time;

/* loaded from: classes3.dex */
public abstract class Clock {
    public static Clock systemUTC() {
        return a.b;
    }

    public long a() {
        return instant().toEpochMilli();
    }

    public abstract Instant instant();
}
