package j$.time.temporal;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class q implements Serializable {
    public static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final g h;
    private static final long serialVersionUID = -1177360819670808121L;
    public final j$.time.c a;
    public final int b;
    public final transient p c;
    public final transient p d;
    public final transient p e;
    public final transient p f;

    static {
        new q(j$.time.c.MONDAY, 4);
        a(j$.time.c.SUNDAY, 1);
        h = h.d;
    }

    public q(j$.time.c cVar, int i) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.c = new p("DayOfWeek", this, chronoUnit, chronoUnit2, p.f);
        this.d = new p("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, p.g);
        g gVar = h.d;
        this.e = new p("WeekOfWeekBasedYear", this, chronoUnit2, gVar, p.i);
        this.f = new p("WeekBasedYear", this, gVar, ChronoUnit.FOREVER, a.YEAR.d);
        Objects.a(cVar, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = cVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q a(j$.time.c cVar, int i) {
        String str = cVar.toString() + i;
        ConcurrentHashMap concurrentHashMap = g;
        q qVar = (q) concurrentHashMap.get(str);
        if (qVar != null) {
            return qVar;
        }
        concurrentHashMap.putIfAbsent(str, new q(cVar, i));
        return (q) concurrentHashMap.get(str);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + String.valueOf(this.a) + "," + this.b + "]";
    }
}
