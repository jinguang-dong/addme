package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmh extends tiv {
    static final tiw a = new tke(4);
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    @Override // defpackage.tiv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Time a(tml tmlVar) throws IOException {
        Time time;
        if (tmlVar.t() == 9) {
            tmlVar.p();
            return null;
        }
        String strJ = tmlVar.j();
        synchronized (this) {
            DateFormat dateFormat = this.b;
            TimeZone timeZone = dateFormat.getTimeZone();
            try {
                try {
                    time = new Time(dateFormat.parse(strJ).getTime());
                } catch (ParseException e) {
                    throw new tis(eld.e(strJ, tmlVar, "Failed parsing '", "' as SQL Time; at path "), e);
                }
            } finally {
                this.b.setTimeZone(timeZone);
            }
        }
        return time;
    }
}
