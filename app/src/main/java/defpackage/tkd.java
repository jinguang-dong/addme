package defpackage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkd extends tiv {
    public static final tiw a = new tkc();
    private final List b;

    public tkd() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (tji.a()) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", Locale.US));
        }
    }

    private final Date c(tml tmlVar) throws IOException {
        List<DateFormat> list = this.b;
        String strJ = tmlVar.j();
        synchronized (list) {
            for (DateFormat dateFormat : list) {
                TimeZone timeZone = dateFormat.getTimeZone();
                try {
                    Date date = dateFormat.parse(strJ);
                    dateFormat.setTimeZone(timeZone);
                    return date;
                } catch (ParseException unused) {
                    dateFormat.setTimeZone(timeZone);
                } catch (Throwable th) {
                    dateFormat.setTimeZone(timeZone);
                    throw th;
                }
            }
            try {
                return tmb.a(strJ, new ParsePosition(0));
            } catch (ParseException e) {
                throw new tis(eld.e(strJ, tmlVar, "Failed parsing '", "' as Date; at path "), e);
            }
        }
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) {
        if (tmlVar.t() != 9) {
            return c(tmlVar);
        }
        tmlVar.p();
        return null;
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ")";
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ")";
    }
}
