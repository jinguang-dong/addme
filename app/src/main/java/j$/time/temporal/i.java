package j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class i implements l {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;
    public static final /* synthetic */ i[] f;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient TemporalUnit b;
    public final transient TemporalUnit c;
    public final transient o d;
    public final transient long e;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        f = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = chronoUnit;
        this.c = chronoUnit2;
        this.d = o.f((-365243219162L) + j, 365241780471L + j);
        this.e = j;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f.clone();
    }

    @Override // j$.time.temporal.l
    public final boolean h(TemporalAccessor temporalAccessor) {
        return temporalAccessor.c(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.l
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.l
    public final o k(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.c(a.EPOCH_DAY)) {
            return this.d;
        }
        throw new j$.time.b("Unsupported field: ".concat(String.valueOf(this)));
    }

    @Override // j$.time.temporal.l
    public final long l(TemporalAccessor temporalAccessor) {
        return temporalAccessor.D(a.EPOCH_DAY) + this.e;
    }

    @Override // j$.time.temporal.l
    public final o range() {
        return this.d;
    }

    @Override // j$.time.temporal.l
    public final Temporal s(Temporal temporal, long j) {
        if (this.d.e(j)) {
            return temporal.a(j$.desugar.sun.nio.fs.g.P(j, this.e), a.EPOCH_DAY);
        }
        throw new j$.time.b("Invalid value: " + this.a + " " + j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
