package j$.sun.nio.cs;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class g extends Charset {
    @Override // java.nio.charset.Charset
    public final boolean contains(Charset charset) {
        return (charset instanceof c) || (charset instanceof f) || charset.name().equals("GBK") || charset.name().equals("GB18030") || charset.name().equals("ISO-8859-2") || charset.name().equals("ISO-8859-3") || charset.name().equals("ISO-8859-4") || charset.name().equals("ISO-8859-5") || charset.name().equals("ISO-8859-6") || charset.name().equals("ISO-8859-7") || charset.name().equals("ISO-8859-8") || charset.name().equals("ISO-8859-9") || charset.name().equals("ISO-8859-13") || charset.name().equals("JIS_X0201") || charset.name().equals("x-JIS0208") || charset.name().equals("JIS_X0212-1990") || charset.name().equals("GB2312") || charset.name().equals("EUC-KR") || charset.name().equals("x-EUC-TW") || charset.name().equals("EUC-JP") || charset.name().equals("x-euc-jp-linux") || charset.name().equals("KOI8-R") || charset.name().equals("TIS-620") || charset.name().equals("x-ISCII91") || charset.name().equals("windows-1251") || charset.name().equals("windows-1253") || charset.name().equals("windows-1254") || charset.name().equals("windows-1255") || charset.name().equals("windows-1256") || charset.name().equals("windows-1257") || charset.name().equals("windows-1258") || charset.name().equals("windows-932") || charset.name().equals("x-mswin-936") || charset.name().equals("x-windows-949") || charset.name().equals("x-windows-950") || charset.name().equals("windows-31j") || charset.name().equals("Big5") || charset.name().equals("Big5-HKSCS") || charset.name().equals("x-MS950-HKSCS") || charset.name().equals("ISO-2022-JP") || charset.name().equals("ISO-2022-KR") || charset.name().equals("x-ISO-2022-CN-CNS") || charset.name().equals("x-ISO-2022-CN-GB") || charset.name().equals("Big5-HKSCS") || charset.name().equals("x-Johab") || charset.name().equals("Shift_JIS");
    }
}
