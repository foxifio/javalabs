import re


if __name__ == "__main__":

    pattern = r"([A-Za-z0-9 .,\-\(\)\[\]\:]+)(?:WFLYSRV)([A-Za-z0-9 :.,\-\(\)]+)(?:OS)\s\S+"
    number_of_matched_requests = 0
    read_lines = 0

    with open("server.log.2018-04-04") as file:
        size = 0
        for line in file:
            read_lines += 1
            if re.match(pattern, line):
                number_of_matched_requests += 1
                print(re.findall(pattern, line))

    print("\nNumber of all read lines: %d" % read_lines)
    print("\nNumber of all stopped Wildfly requests: %d" % number_of_matched_requests)
