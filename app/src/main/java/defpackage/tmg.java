package defpackage;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmg extends tiv {
    static final tiw a = new tke(3);
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    @Override // defpackage.tiv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Date a(tml tmlVar) throws IOException {
        Date date;
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
                    date = new Date(dateFormat.parse(strJ).getTime());
                } catch (ParseException e) {
                    throw new tis(eld.e(strJ, tmlVar, "Failed parsing '", "' as SQL Date; at path "), e);
                }
            } finally {
                this.b.setTimeZone(timeZone);
            }
        }
        return date;
    }
}
