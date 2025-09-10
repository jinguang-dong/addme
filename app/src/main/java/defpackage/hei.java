package defpackage;

import j$.time.Duration;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hei {
    public static final Duration a = Duration.ofSeconds(10);
    private static final sbv b = sbv.r(ltf.VIDEO, "'VID'_yyyyMMdd_HHmmss", ltf.VIDEO_SNAPSHOT, "'VID_SNAP'_yyyyMMdd_HHmmss", ltf.TIMELAPSE, "'TIMELAPSE'_yyyyMMdd_HHmmss", ltf.AMETHYST, "'10-BIT_HDR'_yyyyMMdd_HHmmss", ltf.AMBER, "'CINEMATIC_BLUR'_yyyyMMdd_HHmmss", ltf.CINEMATIC, "'CINEMATIC_PAN'_yyyyMMdd_HHmmss", ltf.VIDEO_NIGHT_SIGHT, "'VIDEO_NIGHT_SIGHT'_yyyyMMdd_HHmmss");

    public static String a(ltf ltfVar, long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        String str = (String) b.get(ltfVar);
        str.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }
}
